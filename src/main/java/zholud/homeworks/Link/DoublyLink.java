package zholud.homeworks.Link;

public class DoublyLink<T> {
    public T data;
    public DoublyLink<T> next;
    public DoublyLink<T> previous;

    public DoublyLink(T data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.println(data + " ");
    }
}