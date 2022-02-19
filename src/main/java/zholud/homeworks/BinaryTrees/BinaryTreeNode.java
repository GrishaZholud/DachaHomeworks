package zholud.homeworks.BinaryTrees;

public class BinaryTreeNode<T> {
    public T data;
    public int keyData;
    public BinaryTreeNode<T> leftChild;
    public BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data, int keyData) {
        this.data = data;
        this.keyData = keyData;
    }
}
