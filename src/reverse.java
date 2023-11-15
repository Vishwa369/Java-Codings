public class reverse {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};

        reverseArr(arr, 0, arr.length - 1);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
    public static void reverseArr(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArr(arr, start + 1, end - 1);
    }
}
