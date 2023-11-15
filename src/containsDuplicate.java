import java.util.HashSet;
public class containsDuplicate {
    public static void main(String[] args){
        int[] num1 = {1,2,3,1};
        int[] num2 = {1,2,3,4};
        int[] num3 = {1,1,1,3,4,4,4,3,5,2,2};

        System.out.println(containsDuplicates(num1));
        System.out.println(containsDuplicates(num2));
        System.out.println(containsDuplicates(num3));
    }
    public static boolean containsDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
