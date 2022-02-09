package zholud.homeworks.SimpleSortings;

/**
 * Класс принимает массив и инкапсулирует его,
 * Содержит метод сортировки пузырьковым методом
 * Содержит приватный метод swap, используемый в реализации сортировки
 */
public class BubbleSorting implements SimpleSortings{
    private int[] array;

    public BubbleSorting(int[] array) {
        this.array = array;
    }

    /**
     * Метод сортирует числа пузырьковым методом
     **/
    @Override
    public void sorting() {
        int out, in;

        for (out = array.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
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

