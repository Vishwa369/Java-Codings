package SortingAlgo;

public class selectionSort {
    static void SelectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            int min_idx = i;

            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        int arr[] = {5, 1, 10, 6, 11, 8, 7, 3, 9, 4, 2};

        System.out.println("Before selection sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        SelectionSort(arr);

        System.out.println("After selection sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
