public class reverseArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] result = reverseArray(arr, arr.length, 0);

        for (int i: result){
            System.out.print(i + " ");
        }
    }
    public static int[] reverseArray(int[] arr, int len, int index) {
        if (index >= len / 2) {
            return arr;
        }
        int temp = arr[index];
        arr[index] = arr[len - index - 1];
        arr[len - index - 1] = temp;

        return reverseArray(arr, len, index+1);
    }
}
