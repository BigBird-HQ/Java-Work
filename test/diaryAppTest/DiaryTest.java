package diaryAppTest;
import diaryApp.Diary;
import diaryApp.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(1, myDiary.getTotalNumberOfEntry());
    }
    @Test
    public void createTwoEntriesIDiary_createEntryTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("title", "body");
        myDiary.createEntry("title1", "body1");
        assertEquals(2, myDiary.getTotalNumberOfEntry());
    }
    @Test
    public void entryCanBeFoundById_findEntryByIdTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("title", "body");
        myDiary.createEntry("title1", "body1");
        Entry foundEntry = myDiary.findEntryById(1);
        assertEquals(myDiary.getEntry().get(0), foundEntry);
    }
    @Test
    public void entryCanBeDeleted_deleteEntryTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("title", "body");
        myDiary.createEntry("title1", "body1");
        myDiary.deleteEntry(1);
        assertEquals(1, myDiary.getTotalNumberOfEntry());
    }
    @Test
    public void entryCanBeUpdated_updateEntryTest() {
        assertFalse(myDiary.isLocked());
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isLocked());
        myDiary.createEntry("title", "body");
        myDiary.createEntry("title1", "body1");
        myDiary.updateEntry(2,"updatedTitle", "updatedBody");
        assertEquals(myDiary.findEntryById(2).getBody(), "updatedBody");
    }

}
