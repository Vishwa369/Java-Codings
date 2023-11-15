public class lS {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int target = 70;

        int result = linearsearch(arr, target);

        if (result == -1){
            System.out.print(target + " is not present in array");
        }
        else {
            System.out.print(target + " is present at index " + result);
        }
    }
    public static int linearsearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
