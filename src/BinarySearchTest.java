import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void step() {
        int[] array = {1, 2, 3};
        BinarySearch search = new BinarySearch(array);
        search.Step(4);
        assertEquals(0, search.result);
        search.Step(4);
        assertEquals(-1, search.result);
    }

    @Test
    void step1() {
        int[] array = {1, 2, 3};
        BinarySearch search = new BinarySearch(array);
        search.Step(1);
        assertEquals(0, search.result);
        search.Step(1);
        assertEquals(1, search.result);
    }

    @Test
    void step2() {
        int[] array = {1, 2, 3};
        BinarySearch search = new BinarySearch(array);
        search.Step(2);
        assertEquals(1, search.result);
    }

    @Test
    void step3() {
        int[] array = {1, 2, 3};
        BinarySearch search = new BinarySearch(array);
        search.Step(3);
        assertEquals(0, search.result);
        search.Step(3);
        assertEquals(1, search.result);
    }

    @Test
    void getResult() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch search = new BinarySearch(array);
        search.Step(2);
        assertEquals(0,search.GetResult());
        search.Step(2);
        assertEquals(0,search.GetResult());
        search.Step(2);
        assertEquals(1,search.GetResult());
    }
    @Test
    void getResult2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch search = new BinarySearch(array);
        search.Step(11);
        assertEquals(0,search.GetResult());
        search.Step(11);
        assertEquals(0,search.GetResult());
        search.Step(11);
        assertEquals(-1,search.GetResult());
    }
}