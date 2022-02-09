package zholud.homeworks.SimpleSortings;

/**
 * Класс принимает массив и инкапсулирует его,
 * Содержит метод сортировки методом вставки
 */
public class InsertionSorting implements SimpleSortings {
    private int[] array;

    public InsertionSorting(int[] array) {
        this.array = array;
    }

    /**
     * Метод сортирует числа методом вставки
     */
    @Override
    public void sorting() {
        int in, out;

        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }
}
