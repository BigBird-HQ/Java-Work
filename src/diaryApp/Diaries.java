package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void add(String username, String password) {
        Diary myDiary = new Diary(username, password);
        diaries.add(myDiary);

    }

    public int getTotalNumberOfDiaries() {
        return diaries.size();
    }
    public List<Diary> getDiaries(){
        return diaries;
    }

    public Diary findByUsername(String username) {
        //Diary expected = null;
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return   diary;
            }
        }
        return null;

    }


    public void delete(String username, String password) {
        diaries.remove(findByUsername(username));
    }
}
