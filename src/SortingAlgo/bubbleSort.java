package SortingAlgo;

public class bubbleSort {
    static void BubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        boolean swapped;
        for (int i = 0; i < n;i++){
            swapped = false;
            for (int j = 1; j < n-i; j++){
                if (arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args){
        int[] arr = {5,1,10,6,11,8,7,3,9,4,2};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
