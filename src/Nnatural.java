public class Nnatural {
    public static void main(String[] args){
        int n = 10;
        int sum = getSum(n);
        System.out.println(sum);
    }
    public static int getSum(int num){
        if (num == 0){
            return num;
        }
        return num + getSum(num-1);
    }
}
