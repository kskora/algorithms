package pl.kskora.algorithms.dac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InversionsCounterTest {
    private InversionsCounter inversionsCounter = new InversionsCounter();

    @Test
    public void shouldCountInversionsOnSimpleArray() {
        // GIVEN
        int[] array = {2, 3, 1};

        // WHEN
        int actual = inversionsCounter.count(array);

        // THEN
        assertEquals(2, actual);
    }

    @Test
    public void shouldCountInversions() {
        // GIVEN
        int[] array = {5, 3, 1, 6, 2, 8, 9, 4, 1};

        // WHEN

        // THEN
    }
}
