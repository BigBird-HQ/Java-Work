package layeredSystemsDiary.data.repository;

import layeredSystemsDiary.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries = new ArrayList<>();
    private long numberOfDiaries;
    private int id;

    @Override
    public Diary save(Diary diary) {
        id = generateId();
        diaries.add(diary);
        numberOfDiaries++;
        return diary;

    }

    private int generateId() {
        return id++;
    }

    @Override
    public List<Diary> findAll() {
        return new ArrayList<>(diaries);
    }

    @Override
    public Diary findById(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername() == username) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public void delete(String username) {
        Diary foundDiary = findById(username);
        diaries.remove(foundDiary);
//        for (Diary diary : diaries) {
//            if (diary.getUsername() == username) {
//                diaries.remove(diary);
//                break;
//            }
//        }
    }

    @Override
    public void delete(Diary diary) {
        diaries.removeIf(diary1 -> diary1 == diary);
    }
}