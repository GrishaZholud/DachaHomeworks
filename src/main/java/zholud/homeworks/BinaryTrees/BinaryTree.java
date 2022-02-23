package zholud.homeworks.BinaryTrees;

public interface BinaryTree<T> {

    /**
     * Метод добавляет элемент в дерево
     *
     * @param keyData ключ элемента
     * @param data    данные элемента
     */
    void insert(int keyData, T data);

    /**
     * Метод удаляет элемент из дерева
     *
     * @param key ключ удаляемого элемента
     * @return удалённый элемент
     */
    boolean delete(int key);

    /**
     * Метод ищет элемент в дереве
     *
     * @param key элемент, который нужно найти
     * @return null - если элемент не найден, иначе возвращается искомый элемент
     */
    BinaryTreeNode<T> findElement(int key);

    /**
     * Метод проверяет, что дерево пустое
     *
     * @return true - дерево пустое, false - дерево не пустое
     */
    boolean isEmpty();

}
