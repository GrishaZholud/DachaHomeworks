package zholud.homeworks.TableEditor;

public interface Table {

    /**
     * Метод добавляет строку в таблицу
     *
     * @param stringEditor строка, добавляется в конец таблицы
     */
    void addLine(Line stringEditor);

    /**
     * Метод удаляет строку из таблицы
     *
     * @param index индекс удаляемой строки
     */
    void removeLine(int index);

    /**
     * Метод добавляет столбец в таблицу и значение в строку
     */
    void addColumn(Column column);

    /**
     * Метод добавляет элемент по индексу строки и столбца
     *
     * @param data        добавляемый элемент
     * @param indexString индекс строки
     * @param indexColumn индекс столбца
     */
    void editElementInString(int indexString, int indexColumn, Comparable<? extends Comparable<?>> data);

    /**
     * Метод удаляет столбец из таблицы
     *
     * @param index индекс удаляемого столбца
     */
    void removeColumn(int index);
}
