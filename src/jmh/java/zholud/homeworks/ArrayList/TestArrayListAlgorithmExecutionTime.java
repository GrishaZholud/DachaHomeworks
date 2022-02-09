package zholud.homeworks.ArrayList;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 2)
@Measurement(iterations = 50, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)

public class TestArrayListAlgorithmExecutionTime {


    @Benchmark
    public void add100Elements() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
    }

    @Benchmark
    public void add1000Elements() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
    }

    @Benchmark
    public void add10000Elements() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
    }

    @Benchmark
    public void add100ElementsWithIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i,i);
        }
    }

    @Benchmark
    public void add1000ElementsWithIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i,i);
        }
    }

    @Benchmark
    public void add10000ElementsWithIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i,i);
        }
    }

    @Benchmark
    public void addAndRemove100ElementsWithIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 100; i++) {
            arrayList.remove(i);
        }
    }

    @Benchmark
    public void addAndRemove1000ElementsWithIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }
    }

    @Benchmark
    public void addAndRemove10000ElementsWithIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(i);
        }
    }

    @Benchmark
    public void addAndRemove100Elements() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(String.valueOf(i));
        }
        for (int i = 0; i < 100; i++) {
            arrayList.remove(String.valueOf(i));
        }
    }

    @Benchmark
    public void addAndRemove1000Elements() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(String.valueOf(i));
        }
    }

    @Benchmark
    public void addAndRemove10000Elements() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(String.valueOf(i));
        }
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(String.valueOf(i));
        }
    }
}