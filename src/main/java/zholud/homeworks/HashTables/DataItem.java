package zholud.homeworks.HashTables;

public class DataItem<T> {
    private T data;
    private int keyData;

    public DataItem(int keyData, T data) {
        this.keyData = keyData;
        this.data = data;
    }

    public int getKeyData() {
        return keyData;
    }

    public T getData() {
        return data;
    }
}
