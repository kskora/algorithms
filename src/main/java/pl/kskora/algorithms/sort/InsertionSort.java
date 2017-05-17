package pl.kskora.algorithms.sort;

public class InsertionSort extends SortAlgorithm  {

    public void sort(int[] array) {
        int n = array.length;

        for(int i = 1; i < n; ++i){
            int val = array[i];

            int j = i - 1;
            while(j >= 0 && array[j] > val){
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = val;
        }
    }
}
