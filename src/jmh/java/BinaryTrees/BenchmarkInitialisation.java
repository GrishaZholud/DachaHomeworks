package BinaryTrees;

import zholud.homeworks.BinaryTrees.CustomBinaryTree;

import java.util.Collections;
import java.util.List;

public class BenchmarkInitialisation {
    private void addAndShuffleElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public void insertNumberElements(CustomBinaryTree<Integer> customBinaryTree, List<Integer> list, int count) {
        addAndShuffleElements(list, count);
        for (int i = 0; i < count; i++) {
            customBinaryTree.insert(list.get(i), i);
        }
    }

    public void deleteNumberElements(CustomBinaryTree<Integer> customBinaryTree, int count) {
        for (int i = 0; i < count; i++) {
            customBinaryTree.delete(i);
        }
    }

    public void findNumberElements(CustomBinaryTree<Integer> customBinaryTree, int count) {
        for (int i = 0; i < count; i++) {
            customBinaryTree.findElement(i);
        }
    }
}
