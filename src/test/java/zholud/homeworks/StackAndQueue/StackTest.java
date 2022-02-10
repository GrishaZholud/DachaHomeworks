package zholud.homeworks.StackAndQueue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackTest {
    Stack<Integer> stack = new Stack(110);

    @Test
    void push() {
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertThat(stack.elementByIndex(6)).isEqualTo(6);
        assertThat(stack.elementByIndex(7)).isEqualTo(7);
    }

    @Test
    void pop() {
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        assertThat(stack.elementByIndex(3)).isEqualTo(3);
        assertThat(stack.elementByIndex(2)).isEqualTo(2);
    }
}