package zholud.homeworks.Link;

public interface MyLinkedList<T> {

    /**
     * Метод проверяет отсутсвие элементов в списке
     *
     * @return true - если список пустой, иначе - false
     */
    boolean isEmpty();

    /**
     * Метод вставляет элемент в начало списка
     *
     * @param data вставляемый элемент
     */
    void insertFirst(T data);

    /**
     * Метод вставляет элемент в конец списка
     *
     * @param data вставляемый элемент
     */
    void insertLast(T data);

    /**
     * Метод удаляет первый элемент списка
     *
     * @return удаляемый элемент
     */
    DoublyLink deleteFirst();

    /**
     * Метод удаляет последний элемент в списке
     *
     * @return удаляемый элемент
     */
    DoublyLink deleteLast();

    /**
     * Метод вставляет элемент после заданного ключа
     *
     * @param key  ключ по которому ищется элемент
     * @param data вставляемый элемент
     * @return true - если элемент успешно вставлен, иначе - false
     */
    boolean insertAfter(T key, T data);

    /**
     * Метод ищет элемент по заданному ключу и удаляет его
     *
     * @param key ключ по которому идёт поиск элемента
     * @return удаляемый элемент
     */
    DoublyLink deleteKey(T key);

    /**
     * Метод выводит все элементы с начала списка
     */
    void displayForward();

    /**
     * Метод выводит все элементы с конца списка
     */
    void displayBackward();
}
