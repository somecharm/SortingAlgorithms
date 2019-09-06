import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortLevelTest {

    @Test
    void selectionSortStep() {
        int[] array = {8,5,1,3,7,4};
        int[] result ={1,3,4,5,7,8};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,0));
    }

@Test
    void selectionSortStep2() {
        int[] array = {8,5,1,3,7,4};
        int[] result ={8,5,1,3,4,7};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,3));
    }

@Test
    void selectionSortStep3() {
        int[] array = {6,3,1,9,2,4,5};
        int[] result ={6,3,1,2,4,5,9};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,2));
    }

@Test
    void selectionSortStep4() {
        int[] array = {6,3,1,9,2,4,5};
        int[] result ={6,3,1,9,2,4,5};
        assertArrayEquals(result,SortLevel.SelectionSortStep(array,5));
    }

    @Test
    void bubbleSortStep() {
        int[] array = {8,5,1,3,7,4};
        int[] result ={1,3,4,5,7,8};
        assertTrue(SortLevel.BubbleSortStep(array));
        assertArrayEquals(result,array);
    }
    @Test
    void bubbleSortStep2() {
        int[] array = {1,5,3,9,2,4};
        int[] result ={1,2,3,4,5,9};
        assertTrue(SortLevel.BubbleSortStep(array));
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