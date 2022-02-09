package zholud.homeworks.SimpleSortings;


import org.junit.jupiter.api.Test;

class BubbleSortingTest extends SortingTest {
    private int[] array = new int[100];

    @Test
    void bubbleSort() {
        addElementsToArray(array);
        BubbleSorting bubbleSorting = new BubbleSorting(array);
        bubbleSorting.sorting();
        compareSmallerElementWithLarger(array);
    }
}