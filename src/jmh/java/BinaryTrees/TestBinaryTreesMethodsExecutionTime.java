package BinaryTrees;

import org.openjdk.jmh.annotations.*;
import zholud.homeworks.BinaryTrees.CustomBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 10, time = 2)
@Measurement(iterations = 50, time = 1, timeUnit = TimeUnit.MICROSECONDS)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class TestBinaryTreesMethodsExecutionTime extends BenchmarkInitialisation {

    @Benchmark
    public void insert100Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 100);
    }

    @Benchmark
    public void insert1000Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 1000);
    }

    @Benchmark
    public void insert10000Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 10000);
    }

    @Benchmark
    public void insertAndDelete100Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 100);
        deleteNumberElements(customBinaryTree, 100);
    }

    @Benchmark
    public void insertAndDelete1000Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 1000);
        deleteNumberElements(customBinaryTree, 1000);
    }

    @Benchmark
    public void insertAndDelete10000Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 10000);
        deleteNumberElements(customBinaryTree, 10000);
    }

    @Benchmark
    public void insertAndFind100Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 100);
        findNumberElements(customBinaryTree, 100);
    }

    @Benchmark
    public void insertAndFind1000Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 1000);
        findNumberElements(customBinaryTree, 1000);
    }

    @Benchmark
    public void insertAndFind10000Elements() {
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();
        List<Integer> list = new ArrayList<>();
        insertNumberElements(customBinaryTree, list, 10000);
        findNumberElements(customBinaryTree, 10000);
    }
}
