package pl.kskora.algorithms.sort;

public class BubbleSort extends SortAlgorithm {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = n - 1; j > i; --j) {
                if (array[j] < array[j - 1]) {
                    ArrayUtils.swap(array, j, j - 1);
                }
            }
        }
    }
}
