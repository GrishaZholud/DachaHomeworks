package zholud.homeworks.SimpleSortings;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingTest {

    public void addElementsToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100 + 1);
        }
    }

    public void compareSmallerElementWithLarger(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            assertThat(array[i] <= array[i + 1]).isEqualTo(true);
        }
    }
}
