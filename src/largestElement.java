public class largestElement {
   public static void main(String[] args){
       int[] arr = {10, 32, 45, 90, 110, 50, 5};
       int largest = finrdLargest(arr, arr.length-1);
       System.out.println("The largest element in the array is: " + largest);
   }
// static int finrdLargest(int[] array){
//       int max = array[0];
//
//       for (int i = 1; i < array.length; i++){
//           if (array[i] > max){
//               max = array[i];
//           }
//       }
//       return max;
//   }

    static int finrdLargest(int[] array, int index){
       if(index == 0){
           return index;
       }
       int maxOfRest = finrdLargest(array, index-1);

       if(array[index] > maxOfRest){
           return array[index];
       }
       else {
           return maxOfRest;
       }
    }
}
