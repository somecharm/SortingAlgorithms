import java.util.Arrays;

public class HeapSort {
    Heap HeapObject;

    public HeapSort(int[] array) {
        HeapObject = new Heap();
        HeapObject.MakeHeap(array);
        for (int i : array) {
            HeapObject.Add(i);
        }
    }

    public int GetNextMax() {
        return HeapObject.GetMax();
    }
}
