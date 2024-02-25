package diaryAppTest;


import diaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiaryTest {


    private Diary myDiary;

    @BeforeEach
    public void setUp() {
        myDiary = new Diary("username", "password");
    }

    @Test
    public void diaryIsUnlocked_isLockedTest() {
        assertFalse(myDiary.isLocked());

    }

    @Test
    public void diaryCanBeLocked_LockDiaryTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void diaryCanBeUnlocked_unlockDiaryTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());

    }

    @Test
    public void createEntryInDiary_createEntryTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("title", "body");


    }
}
