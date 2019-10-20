import java.util.*;

public class SortLevel {
    public static ArrayList<Integer> MergeSort(ArrayList<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }
        int mid = (array.size()) / 2;
        ArrayList<Integer> left = new ArrayList<>(array.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(array.subList(mid, array.size()));
        return Merge(MergeSort(left), MergeSort(right));
    }


    public static ArrayList<Integer> Merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> list = new ArrayList<>();
        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) < right.get(0)) {
                list.add(left.get(0));
                left.remove(0);
            } else {
                list.add(right.get(0));
                right.remove(0);
            }
        }
        if (left.size() > 0) {
            list.addAll(left);
        } else if (right.size() > 0) {
            list.addAll(right);
        }
        return list;
    }

    public static ArrayList KthOrderStatisticsStep(int[] Array, int L, int R, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = ArrayChunk(Array, L, R);
        if (N == k) {
            list.add(L);
            list.add(R);
            return list;
        }
        if (N < k) {
            L = N + 1;
        } else {
            R = N - 1;
        }
        list.add(L);
        list.add(R);
        return list;
    }

    public static void QuickSortTailOptimization(int[] array, int left, int right) {
        while (left < right) {
            int N = ArrayChunk(array, left, right);
            if (N - left < right - N) {
                QuickSortTailOptimization(array, left, N - 1);
                left = N + 1;
            } else {
                QuickSortTailOptimization(array, N + 1, right);
                right = N - 1;
            }
        }
    }

    public static void QuickSort(int[] array, int left, int right) {
        if (left >= right) return;
        int N = ArrayChunk(array, left, right);
        QuickSort(array, left, N - 1);
        QuickSort(array, N + 1, right);
    }

    public static int ArrayChunk(int[] M, int left, int right) {
        int N = M[(left + right) / 2];
        int i1 = left;
        int i2 = right;
        while (true) {
            while (M[i1] < N) i1++;
            while (M[i2] > N) i2--;
            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                N = M[M.length / 2];
                i1 = 0;
                i2 = M.length - 1;
                continue;
            }
            if (i1 == i2 || (i1 == i2 - 1 && M[i1] < M[i2])) {
                return i1;
            }
            swap(M, i1, i2);
        }
    }

    public static int ArrayChunk(int[] M) {
        int N = M[M.length / 2];
        int i1 = 0;
        int i2 = M.length - 1;
        while (true) {
            while (M[i1] < N) i1++;
            while (M[i2] > N) i2--;
            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                N = M[M.length / 2];
                i1 = 0;
                i2 = M.length - 1;
                continue;
            }
            if (i1 == i2 || (i1 == i2 - 1 && M[i1] < M[i2])) {
                return i1;
            }
            swap(M, i1, i2);
        }
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