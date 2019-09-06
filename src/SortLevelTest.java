import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortLevelTest {

    @Test
    void selectionSortStep() {
        int[] array = {8,5,1,3,7,4};
        int[] result ={1,5,8,3,7,4};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,0));
    }

@Test
    void selectionSortStep2() {
        int[] array = {8,5,1,3,7,4};
        int[] result ={8,5,1,3,7,4};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,3));
    }

@Test
    void selectionSortStep3() {
        int[] array = {6,3,1,9,2,4,5};
        int[] result ={6,3,1,2,9,4,5};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,3));
    }

@Test
    void selectionSortStep4() {
        int[] array = {6,3,1,9,2,4,5};
        int[] result ={6,1,3,9,2,4,5};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,1));
    }

    @Test
    void bubbleSortStep() {
        int[] array = {8,5,1,3,7,4};
        int[] result ={5,1,3,7,4,8};
        assertFalse(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result,array);
    }
    @Test
    void bubbleSortStep2() {
        int[] array = {1,5,3,9,2,4};
        int[] result ={1,3,5,2,4,9};
        assertFalse(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result,array);
    }

    @Test
    void bubbleSortStep3() {
        int[] array = {1,2,3};
        int[] result ={1,2,3};
        assertTrue(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result,array);
    }
}