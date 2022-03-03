package zholud.homeworks.HashTables;

public interface HashMap<T> {

    /**
     * Метод возвращает количество элементов в массиве
     *
     * @return кол-во элементов в массиве
     */
    int size();

    /**
     * Метод проверяет, что массива не содержит элементов
     *
     * @return true - если массива не содержит элементов, иначе - false
     */
    boolean isEmpty();

    /**
     * Метод ищет элемент по его ключу
     *
     * @param key ключ искомого элемента
     * @return искомый элемент
     */
    DataItem<T> find(int key);

    /**
     * Метод вставляет элемент в хэш-таблицу
     *
     * @param key  ключ элемента
     * @param data данные элемента
     */
    void insert(int key, T data);

    /**
     * Метод удаляет элемент по его ключу (после удаления ключ становится равным -1)
     *
     * @param key ключ, по которому ищется элемент
     * @return удалённый элемент
     */
    DataItem<T> delete(int key);


}
