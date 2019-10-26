import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GallopingSearchTest {

    @Test
    void gallopingSearch() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertTrue(gallopingSearch.GallopingSearch(array,2));
    }
    @Test
    void gallopingSearch1() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertTrue(gallopingSearch.GallopingSearch(array,0));
    }
    @Test
    void gallopingSearch2() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertTrue(gallopingSearch.GallopingSearch(array,9));
    }
    @Test
    void gallopingSearch3() {
        int[] array = {0,2,3,4,5,6,7,8,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertFalse(gallopingSearch.GallopingSearch(array,1));
    }
    @Test
    void gallopingSearch4() {
        int[] array = {0,1,2,3,4,5,6,7,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertFalse(gallopingSearch.GallopingSearch(array,8));
    }
    @Test
    void gallopingSearch5() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertFalse(gallopingSearch.GallopingSearch(array,10));
    }
    @Test
    void gallopingSearch6() {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        GallopingSearch gallopingSearch = new GallopingSearch();
        assertFalse(gallopingSearch.GallopingSearch(array,-1));
    }
}