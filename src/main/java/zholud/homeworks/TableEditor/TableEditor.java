package zholud.homeworks.TableEditor;

import java.util.LinkedList;

public class TableEditor<T> implements Table {
    private LinkedList<Line> lines;
    private LinkedList<Column> columns;

    //region getter/setter and constructor
    public TableEditor() {
        lines = new LinkedList<>();
        columns = new LinkedList<>();
    }

    public LinkedList<Column> getColumns() {
        return columns;
    }

    public LinkedList<Line> getLines() {
        return lines;
    }
    //endregion

    @Override
    public void addLine(Line line) {
        lines.addLast(line);
    }

    @Override
    public void removeLine(int index) {
        if (tableIsEmpty()) {
            throw new IndexOutOfBoundsException("Нельзя удалить строку, так как таблица пуста");
        }
        lines.remove(index);
    }

    @Override
    public void addColumn(Column column) {
        if (tableIsEmpty()) {
            throw new IndexOutOfBoundsException("Таблица не может добавлять столбцы, не имея строк");
        }
        columns.addLast(column);
        for (int i = 0; i < lines.size(); i++) {
            lines.get(i).getElements().add(null);
        }
    }

    @Override
    public void editElementInString(int indexLine, int indexColumn, Comparable<? extends Comparable<?>> data) {
        if (tableIsEmpty()) {
            throw new IndexOutOfBoundsException("Нельзя удалить элемент в столбце, так как таблица пуста");
        }
        if(indexLine >= lines.size() || indexColumn >= columns.size()) {
            throw new IllegalArgumentException("Вы указали неправильный индекс для столбца или строки");
        }
        if (!data.getClass().equals(columns.get(indexColumn).getDataClass())) {
            throw new IllegalArgumentException("Тип аргумента не соответсвтует");
        }
        lines.get(indexLine).getElements().set(indexColumn, data);
    }

    @Override
    public void removeColumn(int index) {
        if (tableIsEmpty()) {
            throw new IndexOutOfBoundsException("Нельзя удалить столбец, так как таблица пуста");
        }
        if(index >= columns.size()) {
            throw new IllegalArgumentException("Вы указали неправильный индекс");
        }
        for (Line string : getLines()) {
            string.getElements().remove(index);
        }
        columns.remove(index);
    }

    private boolean tableIsEmpty() {
        return lines.size() == 0 && columns.size() == 0;
    }
}
