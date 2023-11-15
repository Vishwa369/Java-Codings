public class armstrongNum {
    public static void main(String[] args){
        int number = 497;
        int num = number;
        int sum = 0;
        int length = String.valueOf(num).length();

        if (checkArmstrong(num, length, sum) == number){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
    public static int checkArmstrong(int num, int length, int sum){
        if (num==0){
            return sum;
        }
        sum += Math.pow(num % 10, length);
        return checkArmstrong(num/10, length, sum);
    }
}
