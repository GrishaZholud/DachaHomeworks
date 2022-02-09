package zholud.homeworks.SimpleSortings;

/**
 * Класс принимает массив и инкапсулирует его,
 * Содержит метод сортировки методом выбора
 * Содержит приватный метод swap, используемый в реализации сортировки
 */
public class SelectionSorting implements SimpleSortings {
    private int[] array;

    public SelectionSorting(int[] array) {
        this.array = array;
    }

    /**
     * Метод сортирует числа методом выбора
     */
    @Override
    public void sorting() {
        int out, in, min;

        for (out = 0; out < array.length - 1; out++) {
            min = out;
            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    /**
     * Метод меняет местами два элемента в массиве
     *
     * @param one индекс первого элемента
     * @param two индекс второго элемента
     */
    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
