package HashTables;

import org.openjdk.jmh.annotations.*;
import zholud.homeworks.HashTables.HashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 2)
@Measurement(iterations = 50, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class TestHashTableMethodsExecutionTime extends BenchmarkInitialization {

    @Benchmark
    public void insert97Elements() {
        HashTable<Integer> hashTable = new HashTable<>(97);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 97);
    }

    @Benchmark
    public void insert997Elements() {
        HashTable<Integer> hashTable = new HashTable<>(997);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 997);
    }

    @Benchmark
    public void insert9973Elements() {
        HashTable<Integer> hashTable = new HashTable<>(9973);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 9973);
    }

    @Benchmark
    public void insertAndDelete97Elements() {
        HashTable<Integer> hashTable = new HashTable<>(97);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 97);
        deleteNumberElements(hashTable);
    }

    @Benchmark
    public void insertAndDelete997Elements() {
        HashTable<Integer> hashTable = new HashTable<>(997);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 997);
        deleteNumberElements(hashTable);
    }

    @Benchmark
    public void insertAndDelete9973Elements() {
        HashTable<Integer> hashTable = new HashTable<>(9973);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 9973);
        deleteNumberElements(hashTable);
    }

    @Benchmark
    public void insertAndFind97Elements() {
        HashTable<Integer> hashTable = new HashTable<>(97);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 97);
        findNumberElements(hashTable);
    }

    @Benchmark
    public void insertAndFind997Elements() {
        HashTable<Integer> hashTable = new HashTable<>(997);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 997);
        findNumberElements(hashTable);
    }

    @Benchmark
    public void insertAndFind9973Elements() {
        HashTable<Integer> hashTable = new HashTable<>(9973);
        List<Integer> list = new ArrayList<>();
        insertNumberElements(hashTable, list, 9973);
        findNumberElements(hashTable);
    }
}
