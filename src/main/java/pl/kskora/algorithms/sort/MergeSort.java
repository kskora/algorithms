package pl.kskora.algorithms.sort;

import java.util.Arrays;

public class MergeSort extends SortAlgorithm  {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        sort(array, 0, n - 1);
    }

    private void sort(int[] array, int p, int r) {
        if (p < r) {
            int q = Math.floorDiv(p + r, 2);
            sort(array, p, q);
            sort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    private void merge(int[] array, int p, int q, int r) {
        int n1 = (q - p) + 1;
        int n2 = r - q;
        int[] left = Arrays.copyOfRange(array, p, q + 1);
        int[] right = Arrays.copyOfRange(array, q + 1, r + 1);

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            if(left[i] < right[j]){
                array[p + i + j] = left[i];
                ++i;
            } else {
                array[p + i + j] = right[j];
                ++j;
            }
        }

        // copy remaining elements to result array
        if(i < n1){
            // copy from left array
            while(i < n1){
                array[p + i + j] = left[i];
                ++i;
            }
        } else {
            // copy from right array
            while(j < n2){
                array[p + i + j] = right[j];
                ++j;
            }
        }
    }
}
