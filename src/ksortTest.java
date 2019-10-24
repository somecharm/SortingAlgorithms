import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ksortTest {

    @Test
    void index() {
        ksort k = new ksort();
        assertEquals(-1,k.index(""));
        assertEquals(0,k.index("a00"));
        assertEquals(11,k.index("a11"));
        assertEquals(111,k.index("b11"));
        assertEquals(799,k.index("h99"));
        assertEquals(-1,k.index("i99"));
    }

    @Test
    void add() {
        ksort k = new ksort();
        assertTrue(k.add("a00"));
        assertTrue(k.add("a01"));
        assertTrue(k.add("a10"));
        assertTrue(k.add("a20"));
        assertFalse(k.add("0jk"));
        assertFalse(k.add("v15"));
        System.out.println(Arrays.toString(k.items));
    }
}