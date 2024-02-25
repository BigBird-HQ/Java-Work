package diaryApp;

import java.util.Map;

public class Diary {
    private String username;
    private boolean isLocked;
    private String password;

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
        Entry myEntry = new Entry(1, "title", "body");



    }
}
