import java.util.*;

public class SortLevel {
    public static int ArrayChunk(int[] M) {
        int N = M[M.length / 2];
        int i1 = 0;
        int i2 = M.length - 1;
        while (true){
            if (M[i1] < N) i1++;
            if (M[i2] > N) i2--;
            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                 N = M[M.length / 2];
                 i1 = 0;
                 i2 = M.length - 1;
                continue;
            }
            if (i1 == i2 || i1 == i2 - 1 && M[i1] < M[i2]){
                break;
            }
            swap(M, i1, i2);
        }
        return M.length / 2;
    }

    public static ArrayList<Integer> KnuthSequence(int array_size) {
        //N(i) = 3 * N(i-1) + 1
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 1; i <= array_size; i = 3 * i + 1) {
            sequence.add(0, i);
        }
        return sequence;
    }

    public static void ShellSort(int[] array) {
        ArrayList<Integer> sequence = KnuthSequence(array.length);
        for (int step : sequence) {
            for (int i = 0; i < step; i++) {
                InsertionSortStep(array, step, i);
            }
        }
    }

    public static void InsertionSortStep(int[] array, int step, int i) {
        for (; i < array.length; i += step) {
            for (int j = i + step; j < array.length; j += step) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

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