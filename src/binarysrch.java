public class binarysrch {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 30;
        int result = binearsearch(arr, target);
        if (result == -1){
            System.out.println(target + " is not present in array");
        }
        else {
            System.out.println(target + " found at index " + result);
        }
    }
    public static int binearsearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right-left)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
}
