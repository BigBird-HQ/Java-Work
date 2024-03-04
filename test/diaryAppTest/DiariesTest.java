package diaryAppTest;

import diaryApp.Diaries;
import diaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {
   private Diaries diaries;

   @BeforeEach
   public void setUp() {
       diaries = new Diaries();
    }

    @Test
    public void addDiaryToDiaries_addDiaryTest() {
        diaries.add("username", "password");
        assertEquals(1, diaries.getTotalNumberOfDiaries());

    }
    @Test
    public void addMoreThanOneDiaryToDiaries_addDiaryTest() {
       diaries.add("username", "password");
       diaries.add("username1", "password");
       assertEquals(2, diaries.getTotalNumberOfDiaries());
    }

    @Test
    public void findDiaryByUserName_findByUsernameTest() {
        diaries.add("username", "password");
        diaries.add("username1", "password");
        Diary expected = diaries.findByUsername("username1");
        assertEquals(expected, diaries.getDiaries().get(1));
    }

    @Test
    public void diaryCanBeDeleted_deleteDiaryTest() {
        diaries.add("username", "password");
        diaries.add("username1", "password");
        diaries.delete("username", "password");
        assertEquals(1, diaries.getTotalNumberOfDiaries());

    }
}
