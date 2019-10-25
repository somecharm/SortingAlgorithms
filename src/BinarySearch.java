public class BinarySearch {
    int Left, Right;
    int[] array;
    int result;

    public BinarySearch(int[] arr) {
        array = arr;
        Left = 0;
        Right = array.length - 1;
        result = 0;
    }

    void Step(int N) {
        if (result != 0) return;
        if (Left == Right) {
            if (array[Left] == N) result = 1;
            else result = -1;
            return;
        }
        int mid = (Left + Right + 1) / 2;
        if (N < array[mid]) {
            Right = mid - 1;
        } else if (N > array[mid]) {
            Left = mid + 1;
        } else {
            result = 1;
        }
    }

    int GetResult() {
        return result;
    }
}
