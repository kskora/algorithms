package pl.kskora.algorithms.dac;

/**
 * Iterative implementation of binary search algorithm.
 */
public class BinarySearch {

    /**
     * Performs binary search on sorted array and trying to find given element.
     * If element exists on array, then its index will be returned, otherwise method returns -1.
     *
     * @param array   sorted array to be searched
     * @param element wanted element
     * @return index of element in array or -1 if element not found
     */
    public int find(int[] array, int element) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int idx = Math.floorDiv(start + end, 2);
            if (array[idx] == element) {
                return idx;
            } else if(array[idx] > element){
                end = idx - 1;
            } else {
                start = idx + 1;
            }
        }
        return -1;
    }
}
