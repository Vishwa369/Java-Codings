package SortingAlgo;

import java.util.Arrays;

public class RadixSort {
    public static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Counting sort based on significant places
    public static void countingSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // Count occurrences of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Update count[i] so that count[i] now contains the
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[] to have numbers sorted based on this digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Radix Sort function
    public static void radixSort(int[] arr) {
        int n = arr.length;
        int max = getMax(arr, n);

        // Do counting sort for every digit
        // Instead of passing digit number, exp is passed where exp is 10^i
        // where i is the current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
