package layeredSystemsTest;

import layeredSystemsDiary.data.models.Entry;
import layeredSystemsDiary.data.repository.EntryRepository;
import layeredSystemsDiary.data.repository.EntryRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryRepositoryImplTest {
    private EntryRepository entryRepository;
    @BeforeEach
    public void setUp() {
        entryRepository = new EntryRepositoryImpl();
    }
    @Test
    public void entryCanBeSavedInRepository_saveEntryTest() {
        Entry entry = new Entry(1,"title", "body");
        entryRepository.save(entry);
        assertEquals(1L, entryRepository.count());
    }
    @Test
    public void moreThanOneEntryCanBeSavedToRepository() {
        Entry entry = new Entry(1,"title", "body");
        Entry entry1 = new Entry(1,"title", "body");
        entryRepository.save(entry);
        entryRepository.save(entry1);
        assertEquals(2L, entryRepository.count());
    }
    @Test
    public void entryCanBeFoundByIdInRepository_findByIdTest() {
        Entry entry = new Entry(1, "title", "body");
        Entry entry1 = new Entry(2,"title", "body");
        entryRepository.save(entry);
        entryRepository.save(entry1);
        assertEquals(2L, entryRepository.count());
        Entry foundEntry = entryRepository.findById(1);
        assertEquals(entry, foundEntry);
    }
    @Test
    public void TwoEntriesCanBeFoundByIdInRepository_findByIdTest() {
        Entry entry = new Entry(1, "title", "body");
        Entry entry1 = new Entry(2,"title", "body");
        entryRepository.save(entry);
        entryRepository.save(entry1);
        assertEquals(2L, entryRepository.count());
        Entry foundEntry = entryRepository.findById(1);
        assertEquals(entry, foundEntry);
        Entry foundEntry1 = entryRepository.findById(2);
        assertEquals(entry1, foundEntry1);
    }
    @Test
    public void allEntriesInRepositoryCaBeFound() {
        Entry entry = new Entry(1, "title", "body");
        Entry entry1 = new Entry(2, "title", "body");
        Entry entry2 = new Entry(3, "title", "body");
        Entry entry3= new Entry(4, "title", "body");
        entryRepository.save(entry);
        entryRepository.save(entry1);
        entryRepository.save(entry2);
        entryRepository.save(entry3);
        assertEquals(4, entryRepository.count());
        List<Entry> foundEntries = new ArrayList<>();
        foundEntries.add(entry);
        foundEntries.add(entry1);
        foundEntries.add(entry2);
        foundEntries.add(entry3);
        assertEquals(entryRepository.findAll(), foundEntries);
    }
    @Test
    public void entryInRepositoryCanBeDeletedById_deleteEntryTest() {
        Entry entry = new Entry(1, "title", "body");
        Entry entry1 = new Entry(2, "title", "body");
        Entry entry2 = new Entry(3, "title", "body");
        Entry entry3= new Entry(4, "title", "body");
        entryRepository.save(entry);
        entryRepository.save(entry1);
        entryRepository.save(entry2);
        entryRepository.save(entry3);
        assertEquals(4, entryRepository.count());
        entryRepository.delete(1);
        assertEquals(3L, entryRepository.count());
    }
    @Test
    public void moreThanOneEntryInRepositoryCanBeDeletedById_deleteEntryTest() {
        Entry entry = new Entry(1, "title", "body");
        Entry entry1 = new Entry(2, "title", "body");
        Entry entry2 = new Entry(3, "title", "body");
        Entry entry3= new Entry(4, "title", "body");
        entryRepository.save(entry);
        entryRepository.save(entry1);
        entryRepository.save(entry2);
        entryRepository.save(entry3);
        assertEquals(4, entryRepository.count());
        entryRepository.delete(1);
        entryRepository.delete(3);
        assertEquals(2L, entryRepository.count());
    }



}
