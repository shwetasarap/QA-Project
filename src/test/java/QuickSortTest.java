import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    QuickSort sorter = new QuickSort();

    @Test
    void testPositiveNumbers() {
        int[] actualArray = {10, 7, 8, 9, 1, 5};
        int[] expectedArray = {1, 5, 7, 8, 9, 10};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Sorted array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void negativeArray() {
        int[] actualArray = {-34, -6, -9, -92, -19, -84, -98};
        int[] expectedArray = {-98, -92, -84, -34, -19, -9, -6};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Sorted array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    void testAlreadySortedArray() {
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Sorted array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void singleElementArray() {
        int[] actualArray = {999};
        int[] expectedArray = {999};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Sorted array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void blankArray() {
        int[] actualArray = {};
        int[] expectedArray = {};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Actual array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void decendingOrderPositiveAndNegativeSort() {
        int[] actualArray = {100, 85, 74, 54, 21, 3, 2, 0, -50, -100};
        int[] expectedArray = {-100, -50, 0, 2, 3, 21, 54, 74, 85, 100};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Sorted array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void duplicateElements() {
        int[] actualArray = {15, 15, 300, 111, 144, 22, 565};
        int[] expectedArray = {15, 15, 22, 111, 144, 300, 565};
        sorter.sort(actualArray, 0, actualArray.length - 1);
        System.out.println("Sorted array is:");
        QuickSort.printArray(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }
    //

    @Test
    void testMainMethod() {
        String[] args = {"Boo"};
        QuickSort.main(args);
    }

    @Test
    void testPrintArray() {
        QuickSort.printArray(new int[]{1, 0, 1, 0});
    }
}




