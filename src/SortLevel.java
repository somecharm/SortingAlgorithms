import java.util.*;

public class SortLevel {
    public static int[] SelectionSortStep(int[] array, int i) {
        for (int k = i; k < array.length; k++) {
            int min = k;
            for (int j = k + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (array[k] > array[min]) {
                swap(array, k, min);
            }
        }
        return array;
    }


    public static boolean BubbleSortStep(int[] array) {
        boolean swaped = false;
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                swaped = true;
            }
            i++;
            if (i == array.length - 1) {
                if (swaped) {
                    i = 0;
                    swaped = false;
                } else {
//                    System.out.println(Arrays.toString(array));
                    return true;
                }
            }
        }
        return false;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}