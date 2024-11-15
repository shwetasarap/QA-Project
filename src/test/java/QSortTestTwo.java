import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class QSortTestTwo{

    QuickSort sorter = new QuickSort();

    @Test
    public void testPositiveNumbers() {
        int[] actualArray = {10, 7, 8, 9, 1, 5};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        int[] expectedArray = {1, 5, 7, 8, 9, 10};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] actualArray = {1, 2, 3, 4, 5};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        int[] expectedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(actualArray, expectedArray);
    }
    @Test
    public void singleElementArray() {
        int[] actualArray = {999};
        int[] expectedArray = {999};
        sorter.sort(actualArray, 0, actualArray.length-1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void blankArray() {
        int[] actualArray = {};
        int[] expectedArray = {};
        sorter.sort(actualArray, 0, actualArray.length-1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void duplicateElements() {
        int[] actualArray = {15, 15, 300, 111, 144, 22, 565};
        int[] expectedArray = {15, 15, 22, 111, 144, 300, 565};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }

    public void sort(int[] actualArray, int i, int i1) {
    }
}