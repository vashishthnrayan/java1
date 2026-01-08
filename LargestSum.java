
import java.util.Scanner;


public class LargestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int [] a= new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Maximum contiguous subarray sum is: " + maxSubArraySum(a));

    } 
    static int maxSubArraySum(int[] a) {
       int size = a.length;
        int max_So_Far = Integer.MIN_VALUE, max_Ending_Here = 0;

        for (int i = 0; i < size; i++) {
            max_Ending_Here = max_Ending_Here + a[i];
            if (max_So_Far < max_Ending_Here)
                max_So_Far = max_Ending_Here;
            if (max_Ending_Here < 0)
                max_Ending_Here = 0;
        }
        return max_So_Far;
    }
}
