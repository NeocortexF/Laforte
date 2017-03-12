package testpuzirek;

import java.util.Arrays;

/**
 * Тест пузырькеовй сортировки
 */
public class puzirek {

    static int[] array = {7, 22, 15, 32, 44, 52, 55, 2, 87, 54, 63, 77, 9, 21};
    static int counter = 0;

    static void sort(int[] array) {
        int temp = 0;
        int out;  // out смещается в конце каждого прохода, чтобы алгоритм не затрагивал уже отсортированные элементы
        for (out = array.length - 1; out > 1; out--) {
            for (int i = 0; i < out; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("До сортировки \n" + Arrays.toString(array));
        sort(array);
        System.out.println("После сортировки \n" + Arrays.toString(array));
        System.out.println("Потребовалось перестановок " + counter);
    }
}
