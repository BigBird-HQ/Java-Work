package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private boolean isLocked;
    private String password;
    private List<Entry> entries = new ArrayList<>();
    private int idNumber;
    private int totalNumberOfEntry;

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
        totalNumberOfEntry++;
    }

    private int generateId() {
        return ++idNumber;
    }

    public int getTotalNumberOfEntry() {
        return totalNumberOfEntry++;
    }


}
