package diaryApp;

import java.util.List;

public class Diaries {
    private List<Diary> diaries;
    public void add(String username, String password) {
        Diary myDiary = new Diary("username", "password");
        diaries.add(myDiary);

    }




}
