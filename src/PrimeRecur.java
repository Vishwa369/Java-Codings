public class PrimeRecur {
    public static void main(String[] args) {
        int num = 36;

        if (isPrime(num)){
            System.out.println(num + " is prime number");
        }
        else {
            System.out.println(num + " is not prime number");
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        return isPrimeRec(n, 2);
    }
    private static boolean isPrimeRec(int n, int i){
        if (i > Math.sqrt(n)){
            return true;
        }
        if (n % i == 0){
            return false;
        }
        return isPrimeRec(n, i+1);
    }
}
