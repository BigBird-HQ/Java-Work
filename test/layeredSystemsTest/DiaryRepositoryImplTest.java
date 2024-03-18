package layeredSystemsTest;

import layeredSystemsDiary.data.models.Diary;
import layeredSystemsDiary.data.repository.DiaryRepository;
import layeredSystemsDiary.data.repository.DiaryRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryRepositoryImplTest {
    private DiaryRepository diaryRepository;
    @BeforeEach
    public void setUp() {
        diaryRepository = new DiaryRepositoryImpl();
    }
    @Test
    public void repositoryCanSaveDiary() {
        Diary diary = new Diary("username", "password");
        diaryRepository.save(diary);
        assertEquals(1L, diaryRepository.count());
    }
    @Test
    public void repositoryCanSaveMoreThanOneDiary_saveDiaryTest() {
        Diary diary = new Diary("username", "password");
        Diary diary1 = new Diary("username", "password");
        diaryRepository.save(diary);
        diaryRepository.save(diary1);
        assertEquals(2L, diaryRepository.count());
    }
    @Test
    public void allDiariesInRepositoryCanBeFound_findAllTest() {
        Diary diary = new Diary("username", "password");
        Diary diary1 = new Diary("username1", "password");
        Diary diary2 = new Diary("username2", "password");
        Diary diary3 = new Diary("username3", "password");
        diaryRepository.save(diary);
        diaryRepository.save(diary1);
        diaryRepository.save(diary2);
        diaryRepository.save(diary3);
        assertEquals(4L, diaryRepository.count());
        List<Diary> foundDiaries = new ArrayList<>();
        foundDiaries.add(diary);
        foundDiaries.add(diary1);
        foundDiaries.add(diary2);
        foundDiaries.add(diary3);
        List<Diary> found = diaryRepository.findAll();
        assertEquals(foundDiaries, found);
    }
    @Test
    public void diaryCanBeFoundByIdInRepository_findByIdTest() {
        Diary diary = new Diary("username", "password");
        Diary diary1 = new Diary("username1", "password");
        diaryRepository.save(diary);
        diaryRepository.save(diary1);
        assertEquals(2L, diaryRepository.count());
        Diary foundDiary = diaryRepository.findById("username1");
        assertEquals(diary1, foundDiary);
    }
    @Test
    public void diaryInRepositoryCanBeDeletedByUsername_deleteDiaryByUsernameTest() {
        Diary diary = new Diary("username", "password");
        Diary diary1 = new Diary("username1", "password");
        diaryRepository.save(diary);
        diaryRepository.save(diary1);
        assertEquals(2L, diaryRepository.count());
        diaryRepository.delete("username");
        assertEquals(1L, diaryRepository.count());
    }
    @Test
    public void moreThanOneDiaryInRepositoryCanBeDeletedByUsername_deleteDiaryByUsernameTest() {
        Diary diary = new Diary("username", "password");
        Diary diary1 = new Diary("username1", "password");
        Diary diary2 = new Diary("username2", "password");
        Diary diary3 = new Diary("username3", "password");
        Diary diary4 = new Diary("username4", "password");
        diaryRepository.save(diary);
        diaryRepository.save(diary1);
        diaryRepository.save(diary2);
        diaryRepository.save(diary3);
        diaryRepository.save(diary4);
        assertEquals(5L, diaryRepository.count());
        diaryRepository.delete("username1");
        diaryRepository.delete("username3");
        diaryRepository.delete("username");
        assertEquals(2L, diaryRepository.count());
    }
    @Test
    public void diaryCanBeDeletedInRepository_DeleteByDiaryTest() {
        Diary diary = new Diary("username", "password");
        diaryRepository.save(diary);
        assertEquals(1L, diaryRepository.count());
        diaryRepository.delete(diary);
        assertEquals(0, diaryRepository.count());
    }
}
