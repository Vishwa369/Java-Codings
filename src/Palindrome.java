public class Palindrome {
    public static void main(String[] args){
        int num = 2121;
        if(ispalindrome(num)){
            System.out.println(num + " is palindrome");
        }
        else {
            System.out.println(num + " is not palindrome");
        }
    }
    public static boolean ispalindrome(int number){
        int originalNum = number;
        int reversedNum = 0;

        while (number != 0){
            int remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }
        return originalNum == reversedNum;
    }
}
