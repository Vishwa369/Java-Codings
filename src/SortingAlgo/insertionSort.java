package SortingAlgo;

public class insertionSort {
    static void InsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args){
        int arr[] = {5,1,10,6,11,8,7,3,9,4,2};

        System.out.println("Before insertion sort");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        InsertionSort(arr);

        System.out.println("After insertion sort");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
