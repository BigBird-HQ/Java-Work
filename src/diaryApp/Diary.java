package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private boolean isLocked;
    private String password;
    private List<Entry> entries = new ArrayList<>();
    private int idNumber;


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public void unlockDiary(String password) {
        if (password.equals(this.password)) this.isLocked = false;
        else {
            throw new IncorrectPasswordException("Incorrect Password");
        }
    }

    public void createEntry(String title, String body) {
        int id = generateId();
        Entry myEntry = new Entry(id, "title", "body");
        entries.add(myEntry);
        entries.size();
    }

    private int generateId() {
        return ++idNumber;
    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }

    public Entry findEntryById(int idNumber) {
        for (Entry myEntry : entries) {
            if (myEntry.getId() == idNumber) {
                return myEntry;
            }
        }
        return null;
    }

    public void deleteEntry(int idNumber) {
        entries.remove(findEntryById(idNumber));
    }

    public void updateEntry(int idNumber, String newTitle, String newBody) {
        Entry updatedEntry = findEntryById(idNumber);
        updatedEntry.setBody("updatedBody");
        updatedEntry.setTitle();
    }
}
