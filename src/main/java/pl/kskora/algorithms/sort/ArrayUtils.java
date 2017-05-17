package pl.kskora.algorithms.sort;

import java.util.Random;

public class ArrayUtils {
    public static void shuffle(int[] array) {
        Random rn = new Random();
        int n = array.length;

        for (int i = 0; i < n; ++i) {
            int idx = i + rn.nextInt(n - i);
            swap(array, i, idx);
        }
    }

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;
    }

    public static void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; ++i) {
            swap(array, i, n - i - 1);
        }
    }
}
