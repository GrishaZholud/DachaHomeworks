package zholud.homeworks.ArrayList;

import java.util.List;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ArrayList<T> implements List<T> {
    private T[] array;
    private int size;


    public ArrayList() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    public ArrayList(int length) {
        this.array = (T[]) new Object[length];
        this.size = 0;
    }

    public ArrayList(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    //region getter/setter
    public T[] getArray() {
        return array;
    }
    //endregion

    @Override
    public void add(int index, T element) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        }
        if (index >= array.length - 1) {
            array = copyOf(array, array.length + index);
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @Override
    public boolean add(T name) {
        if (array.length <= size) {
            array = copyOf(array, array.length * 2);
        }
        array[size] = name;
        size++;
        return true;
    }

    @Override
    public T remove(int index) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        }
        if (size <= 0) {
            return null;
        }
        T object = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return object;
    }

    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
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
    public boolean contains(Object name) {
        for (Object o : array) {
            if (name.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        if(toIndex - fromIndex <= 0) {
            return null;
        }
        T[] subArray = copyOfRange(array, fromIndex, toIndex);
        return new ArrayList<>(subArray);
    }

    public T[] copyOf(T[] original, int newLength) {
        if(newLength < 0) {
            return null;
        }
        T[] array  =(T[]) new Object[newLength];
        for (int i = 0; i < original.length; i++) {
            array[i] = original[i];
        }
        return array;
    }

    public  T[] copyOfRange(T[] original, int from, int to) {
        if(to - from <= 0) {
            return null;
        }
        T[] array = (T[]) new Object[to - from];
        for (int i = from; i < to; i++) {
            array[i] = original[i];
        }
        return array;
    }

    @Override
    public T get(int index) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        }
        return array[index];
    }
    //region list methods

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    public Spliterator spliterator() {
        return List.super.spliterator();
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public Stream stream() {
        return List.super.stream();
    }

    @Override
    public Stream parallelStream() {
        return List.super.parallelStream();
    }

    @Override
    public void forEach(Consumer action) {
        List.super.forEach(action);
    }

    //endregion
}