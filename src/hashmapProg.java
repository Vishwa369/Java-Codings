import java.util.HashMap;
import java.util.Map;

public class hashmapProg {

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 78, 89, 90, 67};
        int largest = findLargest(arr);
        System.out.println("The largest elemtnis ");
    }
    public static int findLargest(int[] array){
        int largest = array[0];
        for (int i =1; i < array.length;i++){
            if (array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
}
