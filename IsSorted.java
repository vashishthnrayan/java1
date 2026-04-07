import java.util.Scanner;
public class IsSorted {
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("Enter the size of the array:");
            int n =  sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            IsSorted obj = new IsSorted();
            boolean result = obj.isSorted(arr);

            if (result) {
                System.out.println("The array is sorted.");
            } else {
                System.out.println("The array is not sorted.");
            }
        }   
    }
}
