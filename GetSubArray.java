import java.util.Scanner;

public class GetSubArray {
    public int[] getSubArray(int[] arr, int start, int end) {
        int  length = end - start + 1;  

        int[] result = new int[length];

        for(int i  =  start ; i <= end ; i++){
            result[i - start] = arr[i];
        }
        return result;
    }

   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        GetSubArray obj = new GetSubArray();
           System.out.println("Enter the size of the array:");
           int n = sc.nextInt();

           int[] arr = new int[n];

           System.out.println("Enter the elements of the array:");
           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
           }

           System.out.println("Enter the start index of the sub-array:");
           int start = sc.nextInt();

           System.out.println("Enter the end index of the sub-array :");
           int end = sc.nextInt();

           int[] subArray = obj.getSubArray(arr, start, end);

           
           System.out.println("Sub-array from index " + start + " to " + end + ":");
           for (int num : subArray) {
               System.out.print(num + " ");
           }
       }
   }
}