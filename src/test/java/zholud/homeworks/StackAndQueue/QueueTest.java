package zholud.homeworks.StackAndQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QueueTest {
    Queue<Integer> queue = new Queue<>(110);

    @Test
    void add() {
        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }
        assertThat(queue.peek()).isEqualTo(0);
        assertThat(queue.printOneObject(50)).isEqualTo(50);
        assertThat(queue.printOneObject(99)).isEqualTo(99);
        assertThat(queue.printOneObject(100)).isEqualTo(null);
    }

    @Test
    void remove() {
        for (int i = 0; i < 110; i++) {
            queue.add(i);
        }
        queue.remove();
        queue.remove();
        assertThat(queue.printOneObject(0)).isEqualTo(null);
        assertThat(queue.printOneObject(1)).isEqualTo(null);
        assertThat(queue.printOneObject(109)).isEqualTo(109);
        queue.add(110);
        assertThat(queue.printOneObject(0)).isEqualTo(110);
    }

    @Test
    void size() {
        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }
        assertThat(queue.size()).isEqualTo(100);
    }

    @Test
    void isEmpty() {
        Assertions.assertTrue(queue.isEmpty());
        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    void isFull() {
        Assertions.assertFalse(queue.isFull());
        for (int i = 0; i < 110; i++) {
            queue.add(i);
        }
        Assertions.assertTrue(queue.isFull());
    }

}

