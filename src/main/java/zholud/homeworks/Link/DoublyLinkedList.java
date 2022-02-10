package zholud.homeworks.Link;

public class DoublyLinkedList<T> implements MyLinkedList<T> {
    public DoublyLink<T> first;
    public DoublyLink<T> last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void insertFirst(T data) {
        DoublyLink newLink = new DoublyLink(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    @Override
    public void insertLast(T data) {
        DoublyLink newLink = new DoublyLink(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    @Override
    public DoublyLink deleteFirst() {
        DoublyLink temp = first;
        if (isEmpty()) {
            return null;
        }
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    @Override
    public DoublyLink deleteLast() {
        DoublyLink temp = last;
        if (isEmpty()) {
            return null;
        }
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    @Override
    public boolean insertAfter(T key, T data) {
        DoublyLink current = first;
        while (!current.data.equals(key)) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        DoublyLink newLink = new DoublyLink(data);
        if (current.equals(last)) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    @Override
    public DoublyLink deleteKey(T key) {
        DoublyLink current = first;
        if (isEmpty()) {
            return null;
        }
        while (!current.data.equals(key)) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current.equals(first)) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current.equals(last)) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    @Override
    public void displayForward() {
        System.out.println("List (first-->last): ");
        DoublyLink current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    @Override
    public void displayBackward() {
        System.out.println("List (last-->first): ");
        DoublyLink current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println(" ");
    }

}
