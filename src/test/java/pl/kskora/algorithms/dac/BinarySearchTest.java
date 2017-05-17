package pl.kskora.algorithms.dac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldNotFoundIndexOnEmptyArray() {
        // GIVEN
        int[] array = {};

        // WHEN
        int actual = binarySearch.find(array, 1);

        // THEN
        assertEquals(-1, actual);
    }

    @Test
    public void shouldNotFoundIndexOnOneElementArray() {
        // GIVEN
        int[] array = {1};

        // WHEN
        int actual = binarySearch.find(array, 2);

        // THEN
        assertEquals(-1, actual);
    }

    @Test
    public void shouldFoundIndexOnOneElementArray() {
        // GIVEN
        int[] array = {1};

        // WHEN
        int actual = binarySearch.find(array, 1);

        // THEN
        assertEquals(0, actual);
    }

    @Test
    public void shouldFoundIndexFromLeftSide() {
        // GIVEN
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // WHEN
        int actual = binarySearch.find(array, 1);

        // THEN
        assertEquals(1, actual);
    }

    @Test
    public void shouldFoundIndexFromRightSide() {
        // GIVEN
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // WHEN
        int actual = binarySearch.find(array, 8);

        // THEN
        assertEquals(8, actual);
    }

    @Test
    public void shouldFoundIndexInLargeArray() {
        // GIVEN
        int[] array = new int[100000000];
        Arrays.setAll(array, x -> x);

        // WHEN
        int actual = binarySearch.find(array, 78906);

        // THEN
        assertEquals(78906, actual);
    }

}
