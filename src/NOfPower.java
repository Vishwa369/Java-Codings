public class NOfPower {
    public static void main(String[] args){
        int base = 2;
        int exponent = 3;

        System.out.println("The power of 2 is: " + powerOfN(base, exponent));
    }
   public static int powerOfN(int base, int exp){
        if (exp == 0){
            return 1;
        }
        return base * powerOfN(base, exp-1);
   }
}
