package layeredSystemsDiary.data.repository;

import layeredSystemsDiary.data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository{
    private List<Entry> entries = new ArrayList<>();
    private long numberOfEntries;
    private int id;

    public EntryRepositoryImpl() {

    }

    @Override
    public Entry save(Entry entry) {
        id = generateId();
        entries.add(entry);
        numberOfEntries++;
        return entry;
    }

    private int generateId() {
        return id++;
    }

    @Override
    public List<Entry> findAll() {
        return entries;
    }

    @Override
    public Entry findById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public long count() {
        return entries.size() ;
    }

    @Override
    public void delete(int id) {
        entries.remove(findById(id));
    }
}
