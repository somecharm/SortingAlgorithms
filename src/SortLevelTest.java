import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortLevelTest {

    @Test
    void selectionSortStep() {
        int[] array = {8, 5, 1, 3, 7, 4};
        int[] result = {1, 5, 8, 3, 7, 4};
        assertArrayEquals(result, SortLevel.SelectionSortStep(array, 0));
    }

    @Test
    void selectionSortStep2() {
        int[] array = {8, 5, 1, 3, 7, 4};
        int[] result = {8, 5, 1, 3, 7, 4};
        assertArrayEquals(result, SortLevel.SelectionSortStep(array, 3));
    }

    @Test
    void selectionSortStep3() {
        int[] array = {6, 3, 1, 9, 2, 4, 5};
        int[] result = {6, 3, 1, 2, 9, 4, 5};
        assertArrayEquals(result, SortLevel.SelectionSortStep(array, 3));
    }

    @Test
    void selectionSortStep4() {
        int[] array = {6, 3, 1, 9, 2, 4, 5};
        int[] result = {6, 1, 3, 9, 2, 4, 5};
        assertArrayEquals(result, SortLevel.SelectionSortStep(array, 1));
    }

    @Test
    void bubbleSortStep() {
        int[] array = {8, 5, 1, 3, 7, 4};
        int[] result = {5, 1, 3, 7, 4, 8};
        assertFalse(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result, array);
    }

    @Test
    void bubbleSortStep2() {
        int[] array = {1, 5, 3, 9, 2, 4};
        int[] result = {1, 3, 5, 2, 4, 9};
        assertFalse(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result, array);
    }

    @Test
    void bubbleSortStep3() {
        int[] array = {1, 2, 3};
        int[] result = {1, 2, 3};
        assertTrue(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result, array);
    }

    @Test
    void insertionSortStep() {
        int[] array = {1, 6, 5, 4, 3, 2, 7};
        int[] result = {1, 3, 5, 4, 6, 2, 7};
        SortLevel.InsertionSortStep(array, 3, 1);
        assertArrayEquals(result, array);
    }

    @Test
    void insertionSortStep2() {
        int[] array = {7, 6, 5, 4, 3, 2, 1};
        int[] result = {1, 6, 5, 4, 3, 2, 7};
        SortLevel.InsertionSortStep(array, 3, 0);
        assertArrayEquals(result, array);
    }

    @Test
    void insertionSortStep3() {
        int[] array = {1, 3, 5, 4, 6, 2, 7};
        int[] result = {1, 3, 2, 4, 6, 5, 7};
        SortLevel.InsertionSortStep(array, 3, 2);
        assertArrayEquals(result, array);
    }

    @Test
    void knuthSequence() {
        System.out.println(SortLevel.KnuthSequence(145));
    }

    @Test
    void shellSort() {
        int[] array = {15, 14, 8, 4, 6, 2, 7, 11, 9, 1, 12, 10, 3, 13, 5};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        SortLevel.ShellSort(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(result, array);
    }

    @Test
    void arrayChunk() {
        int[] array = {7, 5, 6, 4, 3, 1, 2};
        int[] result = {2, 1, 3, 4, 6, 5, 7};
        assertEquals(3, SortLevel.ArrayChunk(array));
        System.out.println(Arrays.toString(array));
        assertArrayEquals(result, array);
    }

    @Test
    void arrayChunk2() {
        int[] array = {1, 3, 4, 6, 5, 2, 8};
        int[] result = {1, 3, 4, 2, 5, 6, 8};
        assertEquals(5, SortLevel.ArrayChunk(array));
        System.out.println(Arrays.toString(array));
        assertArrayEquals(result, array);
    }

    @Test
    void quickSort() {
        int[] array = {1, 3, 4, 6, 5, 2, 8};
        int[] result = {1, 2, 3, 4, 5, 6, 8};
        SortLevel.QuickSortTailOptimization(array, 0, array.length - 1);
        assertArrayEquals(array, result);
    }

    @Test
    void quickSort2() {
        int[] array = {6, 5, 4, 3, 2};
        int[] result = {2, 3, 4, 5, 6};
        SortLevel.QuickSortTailOptimization(array, 0, array.length - 1);
        assertArrayEquals(array, result);
    }

    @Test
    void quickSort3() {
        int[] array = {2, 1, 3, 0, 8, 4, 9, 6, 5, 7};
        int[] result = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        SortLevel.QuickSortTailOptimization(array, 0, array.length - 1);
        assertArrayEquals(array, result);
    }

}