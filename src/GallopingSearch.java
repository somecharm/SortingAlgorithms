public class GallopingSearch {

    public GallopingSearch() {
    }

    public boolean GallopingSearch(int[] array, int N) {
        if (N > array[array.length - 1] || N < array[0]) return false;
        int i = 1;
        int index = (int) Math.pow(2, i) - 2;
        while (array[index] <= N) {
            if (array[index] == N) {
                return true;
            }
            index = (int) Math.pow(2, ++i) - 2;
            if (index > array.length - 1) {
                index = array.length - 1;
            }
        }
        BinarySearch binarySearch = new BinarySearch(array);
        if (array[index] > N) {

            binarySearch.Left = (int) (Math.pow(2, i - 1) - 2) + 1;
            binarySearch.Right = index;
            while (binarySearch.GetResult() == 0) {
                binarySearch.Step(N);
            }
        }
        return (binarySearch.GetResult() == 1);
    }
}

class BinarySearch {
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
            Left = mid;
            Right = mid;
            result = 1;
        }
    }

    int GetResult() {
        return result;
    }
}
