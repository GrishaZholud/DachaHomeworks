package zholud.homeworks.TableEditor;

public class Column<T extends Comparable<T>> {
    private final String title;
    private T data;

    public Column(String title, T data) {
        this.title = title;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Class getDataClass() {
        return data.getClass();
    }
}
