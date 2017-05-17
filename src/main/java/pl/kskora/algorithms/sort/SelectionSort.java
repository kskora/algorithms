package pl.kskora.algorithms.sort;

public class SelectionSort extends SortAlgorithm  {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minIdx = minIndex(array, i);
            ArrayUtils.swap(array, i, minIdx);
        }
    }

    private int minIndex(int[] array, int index) {
        int minIdx = index;
        while (++index < array.length) {
            if (array[minIdx] > array[index]) {
                minIdx = index;
            }
        }
        return minIdx;
    }
}
