package StackAndQueue;

import org.openjdk.jmh.annotations.*;
import zholud.homeworks.StackAndQueue.Queue;
import zholud.homeworks.StackAndQueue.Stack;

import java.util.concurrent.TimeUnit;

public class TestStackAndQueueAlgorithmExecutionTime {
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 10, time = 2)
    @Measurement(iterations = 50, time = 1, timeUnit = TimeUnit.MICROSECONDS)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Benchmark
        public void pushStackWithMaxSize100() {
            Stack stack = new Stack(100);
            for (int i = 0; i < 100; i++) {
                stack.push(i);
            }
        }

        @Benchmark
        public void pushStackWithMaxSize1000() {
            Stack stack = new Stack(1000);
            for (int i = 0; i < 1000; i++) {
                stack.push(i);
            }
        }

        @Benchmark
        public void pushStackWithMaxSize10000() {
            Stack stack = new Stack(10000);
            for (int i = 0; i < 10000; i++) {
                stack.push(i);
            }
        }

        @Benchmark
        public void pushAndPopStackWithMaxSize100() {
            Stack stack = new Stack(100);

            for (int i = 0; i < 100; i++) {
                stack.push(i);
            }

            for (int i = 0; i < 100; i++) {
                stack.pop();
            }
        }

        @Benchmark
        public void pushAndPopStackWithMaxSize1000() {
            Stack stack = new Stack(1000);

            for (int i = 0; i < 1000; i++) {
                stack.push(i);
            }

            for (int i = 0; i < 1000; i++) {
                stack.pop();
            }
        }

        @Benchmark
        public void pushAndPopStackWithMaxSize10000() {
            Stack stack = new Stack(10000);

            for (int i = 0; i < 10000; i++) {
                stack.push(i);
            }

            for (int i = 0; i < 10000; i++) {
                stack.pop();
            }
        }

        @Benchmark
        public void addQueueWithMaxSize100() {
            Queue<Integer> queue = new Queue<>(100);
            for (int i = 0; i < 100; i++) {
                queue.add(i);
            }
        }

        @Benchmark
        public void addQueueWithMaxSize1000() {
            Queue<Integer> queue = new Queue<>(1000);
            for (int i = 0; i < 1000; i++) {
                queue.add(i);
            }
        }

        @Benchmark
        public void addQueueWithMaxSize10000() {
            Queue<Integer> queue = new Queue<>(10000);
            for (int i = 0; i < 10000; i++) {
                queue.add(i);
            }
        }

        @Benchmark
        public void removeQueueWithMaxSize100() {
            Queue<Integer> queue = new Queue<>(100);
            for (int i = 0; i < 100; i++) {
                queue.add(i);
            }

            for (int i = 0; i < 100; i++) {
                queue.remove();
            }
        }

        @Benchmark
        public void removeQueueWithMaxSize1000() {
            Queue<Integer> queue = new Queue<>(1000);
            for (int i = 0; i < 1000; i++) {
                queue.add(i);
            }

            for (int i = 0; i < 1000; i++) {
                queue.remove();
            }
        }

        @Benchmark
        public void removeQueueWithMaxSize10000() {
            Queue<Integer> queue = new Queue<>(10000);
            for (int i = 0; i < 10000; i++) {
                queue.add(i);
            }

            for (int i = 0; i < 10000; i++) {
                queue.remove();
            }
        }
}
