import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    @Test
    void getNextMax() {
        int[] array = {3, 5, 7, 1, 2, 6};
        HeapSort heapSort = new HeapSort(array);
        assertEquals(7, heapSort.GetNextMax());
    }

    @Test
    void getNextMax2() {
        int[] array = {};
        HeapSort heapSort = new HeapSort(array);
        assertEquals(-1, heapSort.GetNextMax());
    }
}