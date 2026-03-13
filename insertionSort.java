
import java.util.Scanner;

public class insertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(
            "Enter the No of elements in the array :"

        );
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); //read each element 
        }

        insertionSort ob = new insertionSort();

        ob.sort(arr);

        System.out.println("Sorted array :");
        printArray(arr);
    }
}