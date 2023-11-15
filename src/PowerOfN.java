public class PowerOfN {
    public static void main(String[] args){
        int base = 3;
        int powr = 4;

        System.out.println(PowerNum(base, powr));
        return;
    }
    static int PowerNum(int base, int powr){
        if(powr == 0){
            return 1;
        }
        return base * PowerNum(base, powr-1);
    }
}
