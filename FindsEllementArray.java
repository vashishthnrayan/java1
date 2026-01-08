
import java.util.Scanner;


public class FindsEllementArray {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);   

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements to search for: ");
        int d= scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+ n + " elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int ans = find(arr, d);
        if (ans == -1){
            System.out.println("Element not found in the array");
            
        }else{
            System.out.println("Element found at index: " + ans);
        }
    }
        public static int find(int[] arr, int d){
            for(int i=0; i<arr.length; i++){
                if(arr[i] == d){
                    return i;
                }
            }
            return -1;
        }
    }    

