package zholud.homeworks.StackAndQueue;

import java.util.Collection;
import java.util.Iterator;

public class Queue<T> implements java.util.Queue {
    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int size;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queArray.length;
    }

    @Override
    public boolean add(Object o) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = (T) o;
        size++;
        return true;
    }

    @Override
    public Object peek() {
        return queArray[front];
    }

    public void print() {
        for (T t : queArray) {
            System.out.println(t);
        }
    }

    @Override
    public T remove() {
        queArray[front] = null;
        T temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        size--;
        return temp;
    }

    @Override
    public boolean contains(Object o) {
        for (T t : queArray) {
            if (o.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public T printOneObject(int index) {
        return queArray[index];
    }

    //region implements methods
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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
    //endregion

}