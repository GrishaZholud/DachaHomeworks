package zholud.homeworks.HashTables;


public class HashTable<T> implements HashMap<T> {
    private DataItem<T>[] hashArray;
    private int size;
    private DataItem<T> nonItem;

    public HashTable(int length) {
        hashArray = new DataItem[length];
        size = 0;
        nonItem = new DataItem(-1, null);
    }

    public DataItem<T>[] getHashArray() {
        return hashArray;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public DataItem<T> find(int key) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Хэш-таблица не содерит элементов");
        }
        int hashValue = hashFunction(key);
        int stepSize = hashFunctionForStep(key);
        int stepCount = 0;
        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKeyData() == key) {
                return hashArray[hashValue];
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
            if (stepCount >= hashArray.length) {
                throw new IllegalArgumentException("Не удалось найти элемент");
            }
            stepCount++;
        }
        throw new IllegalArgumentException("Не удалось найти элемент");
    }

    @Override
    public void insert(int key, T data) {
        int hashValue = hashFunction(key);
        int stepSize = hashFunctionForStep(key);
        int stepCount = 0;

        while (hashArray[hashValue] != null && hashArray[hashValue].getKeyData() != -1) {
            if (hashArray[hashValue].getKeyData() == key) {
                throw new IllegalArgumentException("Такой элемент был вставлен ранее");
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
            if (stepCount >= hashArray.length) {
                throw new IllegalArgumentException("Не удалось вставить элемент");
            }
            stepCount++;
        }
        hashArray[hashValue] = new DataItem<>(key, data);
        size++;
    }

    @Override
    public DataItem<T> delete(int key) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Хэш-таблица не содержит элементов");
        }
        int hashValue = hashFunction(key);
        int stepSize = hashFunctionForStep(key);
        int stepCount = 0;

        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getKeyData() == key) {
                DataItem<T> temp = hashArray[hashValue];
                hashArray[hashValue] = nonItem;
                size--;
                return temp;
            }
            hashValue += stepSize;
            hashValue %= hashArray.length;
            if (stepCount >= hashArray.length) {
                throw new IllegalArgumentException("Элемент с таким ключом не был найден");
            }
            stepCount++;
        }
        throw new IllegalArgumentException("Элемент с таким ключом не был найден");
    }

    private int hashFunction(int key) {
        return key % hashArray.length;
    }

    private int hashFunctionForStep(int key) {
        return 5 - key % 5;
    }
}
