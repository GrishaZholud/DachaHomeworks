package HashTables;

import zholud.homeworks.HashTables.HashTable;

import java.util.Collections;
import java.util.List;


public class BenchmarkInitialization {
    public void addAndShuffleElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public void insertNumberElements(HashTable<Integer> hashTable, List<Integer> list, int count) {
        addAndShuffleElements(list, count);
        for (int i = 0; i < count; i++) {
            hashTable.insert(list.get(i), i);
        }
    }

    public void deleteNumberElements(HashTable<Integer> hashTable) {
        for (int i = 0; i < hashTable.size(); i++) {
            hashTable.delete(i);
        }
    }

    public void findNumberElements(HashTable<Integer> hashTable) {
        for (int i = 0; i < hashTable.size(); i++) {
            hashTable.find(i);
        }
    }

}
