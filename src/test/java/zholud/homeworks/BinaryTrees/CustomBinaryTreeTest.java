package zholud.homeworks.BinaryTrees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class CustomBinaryTreeTest {
    private final CustomBinaryTree<String> customBinaryTree = new CustomBinaryTree<>();

    @Test
    public void emptyTreeOperations() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> customBinaryTree.delete(5));
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> customBinaryTree.findElement(5));
    }

    @Test
    public void operationsOnNonExistentElement() {
        customBinaryTree.insert(10, "First");
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> customBinaryTree.delete(20));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> customBinaryTree.findElement(20));
    }

    @Test
    public void insertDuplicateElements() {
        customBinaryTree.insert(10, "First");
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> customBinaryTree.insert(10, "First"));
    }

    @Test
    void insert() {
        customBinaryTree.insert(10, "First");
        customBinaryTree.insert(5, "Second");
        customBinaryTree.insert(15, "Third");
        assertThat(customBinaryTree.findElement(5).data).isEqualTo("Second");
        assertThat(customBinaryTree.findElement(15).data).isEqualTo("Third");
    }

    @Test
    void delete() {
        customBinaryTree.insert(10, "First");
        customBinaryTree.insert(5, "Second");
        customBinaryTree.insert(15, "Third");
        assertThat(customBinaryTree.delete(5)).isEqualTo(true);
        assertThat(customBinaryTree.delete(15)).isEqualTo(true);
        assertThat(customBinaryTree.delete(10)).isEqualTo(true);
        assertThat(customBinaryTree.isEmpty()).isEqualTo(true);
    }

    @Test
    void findElement() {
        customBinaryTree.insert(10, "First");
        customBinaryTree.insert(5, "Second");
        customBinaryTree.insert(15, "Third");
        assertThat(customBinaryTree.findElement(10).data).isEqualTo("First");
        assertThat(customBinaryTree.findElement(15).data).isEqualTo("Third");
    }
}