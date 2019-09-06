import java.util.*;

public class SortLevel {
    public static int[] SelectionSortStep(int[] array, int i) {
        int min = i;
        for (int j = i; j < array.length; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }
        swap(array, i, min);
        return array;
    }


    public static boolean BubbleSortStep(int[] array) {
        boolean swaped = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                swaped = true;
            }
        }
        return !swaped;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}