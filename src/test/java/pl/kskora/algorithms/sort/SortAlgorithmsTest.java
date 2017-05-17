package pl.kskora.algorithms.sort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAlgorithmsTest {
    private static final int SIZE = 10000;
    private static final int[] EXPECTED = new int[SIZE];

    @BeforeAll
    public static void setup() {
        Arrays.setAll(EXPECTED, idx -> idx);
    }

    @ParameterizedTest
    @MethodSource(names = "sortAlgorithmsProvider")
    public void sortRandomUnOrderedTest(ISortAlgorithm algorithm) {
        // GIVEN
        int[] actual = Arrays.copyOf(EXPECTED, SIZE);
        ArrayUtils.shuffle(actual);

        // WHEN
        long time = sort(actual, algorithm);

        // THEN
        assertArrayEquals(EXPECTED, actual, algorithm + " not works!");
        System.out.println(String.format("%s: %d ms on random ordered array.", algorithm, time));
    }

    @ParameterizedTest
    @MethodSource(names = "sortAlgorithmsProvider")
    public void sortReverseOrderedTest(ISortAlgorithm algorithm) {
        // GIVEN
        int[] actual = Arrays.copyOf(EXPECTED, SIZE);
        ArrayUtils.reverse(actual);

        // WHEN
        long time = sort(actual, algorithm);

        // THEN
        assertArrayEquals(EXPECTED, actual, algorithm + " not works!");
        System.out.println(String.format("%s: %d ms on reverse ordered array.", algorithm, time));
    }

    @ParameterizedTest
    @MethodSource(names = "sortAlgorithmsProvider")
    public void sortOrderedTest(ISortAlgorithm algorithm) {
        // GIVEN
        int[] actual = Arrays.copyOf(EXPECTED, SIZE);

        // WHEN
        long time = sort(actual, algorithm);

        // THEN
        assertArrayEquals(EXPECTED, actual, algorithm + " not works!");
        System.out.println(String.format("%s: %d ms on ordered array.", algorithm, time));
    }

    // Returns sort algorithms to test
    static Stream sortAlgorithmsProvider() {
        return Stream.of(new InsertionSort(), new SelectionSort(), new MergeSort(), new BubbleSort());
    }

    // Sort array and return sorting time
    private long sort(int[] array, ISortAlgorithm algorithm) {
        long start = System.currentTimeMillis();
        algorithm.sort(array);
        return System.currentTimeMillis() - start;
    }
}
