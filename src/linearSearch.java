class linearSearch {

    public static void LinearSearch(int[] arr, int item){
        for(int i = 0; i<arr.length;i++){
            if (arr[i] == item){
                System.out.println(item + " found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args){
        int[] arr = {12,45,4,21,6,17,8,48,41,5,};

        int item = 5;
        LinearSearch(arr, item);
    }
}
