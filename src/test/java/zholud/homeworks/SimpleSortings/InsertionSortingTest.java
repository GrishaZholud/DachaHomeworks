package zholud.homeworks.SimpleSortings;


import org.junit.jupiter.api.Test;

class InsertionSortingTest extends SortingTest {
    private int[] array = new int[100];

    @Test
    void insertionSort() {
        addElementsToArray(array);
        InsertionSorting insertionSorting = new InsertionSorting(array);
        insertionSorting.sorting();
        compareSmallerElementWithLarger(array);
    }
}