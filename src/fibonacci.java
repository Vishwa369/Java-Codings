public class fibonacci {
    public static void main(String[] args){
        int num = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= num; i++){
            sb.append(fibonacciN(i)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    public static int fibonacciN(int n){
        if (n <= 1){
            return n;
        }
        return fibonacciN(n-1) + fibonacciN(n-2);
    }
}
