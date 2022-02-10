package Link;

import org.openjdk.jmh.annotations.*;
import zholud.homeworks.Link.DoublyLinkedList;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 2)
@Measurement(iterations = 50, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class TestDoublyLinkedListAlgorithmExecutionTime {

    private void insertFirstForNumberOfElements(int count, DoublyLinkedList<Integer> doublyLinkedList) {
        for (int i = 0; i < count; i++) {
            doublyLinkedList.insertFirst(i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstWith100Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(100, doublyLinkedList);
    }

    @Benchmark
    public void doublyLinkedListInsertFirstWith1000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(1000, doublyLinkedList);
    }

    @Benchmark
    public void doublyLinkedListInsertFirstWith10000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(10000, doublyLinkedList);
    }

    @Benchmark
    public void doublyLinkedListInsertLastWith100Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        for (int i = 0; i < 100; i++) {
            doublyLinkedList.insertLast(i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertLastWith1000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        for (int i = 0; i < 1000; i++) {
            doublyLinkedList.insertLast(i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertLastWith10000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        for (int i = 0; i < 10000; i++) {
            doublyLinkedList.insertLast(i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertAfterWith100Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        for (int i = 1; i < 100; i++) {
            doublyLinkedList.insertAfter(i, i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertAfterWith1000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        for (int i = 1; i < 1000; i++) {
            doublyLinkedList.insertAfter(i, i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertAfterWith10000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        for (int i = 1; i < 10000; i++) {
            doublyLinkedList.insertAfter(i, i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteFirstWith100Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(100, doublyLinkedList);
        while (!doublyLinkedList.isEmpty()) {
            doublyLinkedList.deleteFirst();
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteFirstWith1000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(1000, doublyLinkedList);
        while (!doublyLinkedList.isEmpty()) {
            doublyLinkedList.deleteFirst();
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteFirstWith10000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(10000, doublyLinkedList);
        while (!doublyLinkedList.isEmpty()) {
            doublyLinkedList.deleteFirst();
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteLastWith100Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(100, doublyLinkedList);
        while (!doublyLinkedList.isEmpty()) {
            doublyLinkedList.deleteLast();
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteLastWith1000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(1000, doublyLinkedList);
        while (!doublyLinkedList.isEmpty()) {
            doublyLinkedList.deleteLast();
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteLastWith10000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(10000, doublyLinkedList);
        while (!doublyLinkedList.isEmpty()) {
            doublyLinkedList.deleteLast();
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteKeyWith100Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(100, doublyLinkedList);
        for (int i = 0; i < 100; i++) {
            doublyLinkedList.deleteKey(i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteKeyWith1000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(1000, doublyLinkedList);
        for (int i = 0; i < 1000; i++) {
            doublyLinkedList.deleteKey(i);
        }
    }

    @Benchmark
    public void doublyLinkedListInsertFirstAndDeleteKeyWith10000Elements() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        insertFirstForNumberOfElements(10000, doublyLinkedList);
        for (int i = 0; i < 10000; i++) {
            doublyLinkedList.deleteKey(i);
        }
    }
}
