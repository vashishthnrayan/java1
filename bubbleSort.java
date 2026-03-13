
import java.util.Scanner;

class bubbleSort {
    public static void BubbleSort(int[] arr, int n) {
        
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    static void printArray(int[] arr,int size) {
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        System.out.println("Enter the number of elements in the array:");
        int n = scn.nextInt();

        int []arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
       BubbleSort(arr,n);

       printArray(arr, n);
    }
}