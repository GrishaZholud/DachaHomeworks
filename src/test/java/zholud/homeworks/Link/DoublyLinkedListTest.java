package zholud.homeworks.Link;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoublyLinkedListTest {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    @Test
    void insertFirst() {
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(200);
        doublyLinkedList.insertFirst(300);
        assertThat(doublyLinkedList.first.data).isEqualTo(300);
        assertThat(doublyLinkedList.last.data).isEqualTo(100);
    }

    @Test
    void insertLast() {
        doublyLinkedList.insertLast(100);
        doublyLinkedList.insertLast(200);
        doublyLinkedList.insertLast(300);
        assertThat(doublyLinkedList.first.data).isEqualTo(100);
        assertThat(doublyLinkedList.last.data).isEqualTo(300);
    }

    @Test
    void deleteFirst() {
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(200);
        doublyLinkedList.insertFirst(300);
        assertThat(doublyLinkedList.first).isEqualTo(doublyLinkedList.deleteFirst());
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteFirst();
        assertThat(doublyLinkedList.deleteFirst()).isEqualTo(null);
    }

    @Test
    void deleteLast() {
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(200);
        doublyLinkedList.insertFirst(300);
        assertThat(doublyLinkedList.last).isEqualTo(doublyLinkedList.deleteLast());
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteLast();
        assertThat(doublyLinkedList.deleteLast()).isEqualTo(null);
    }

    @Test
    void insertAfter() {
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(200);
        doublyLinkedList.insertFirst(300);
        assertThat(doublyLinkedList.insertAfter(300, 400)).isEqualTo(true);
        doublyLinkedList.deleteFirst();
        assertThat(doublyLinkedList.first.data).isEqualTo(400);
        assertThat(doublyLinkedList.insertAfter(300, 300)).isEqualTo(false);
    }

    @Test
    void deleteKey() {
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(200);
        doublyLinkedList.insertFirst(300);
        assertThat(doublyLinkedList.first).isEqualTo(doublyLinkedList.deleteKey(300));
        assertThat(doublyLinkedList.deleteKey(400)).isEqualTo(null);
    }
}