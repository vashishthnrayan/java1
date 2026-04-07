import java.util.Scanner;
public class RemoveDuplicates {
    public int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int  i  = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;  
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
                index++;
            }
            
        } 
        int[] trimmedResult = new int[index];
        for (int i = 0; i <index;i++){
            trimmedResult[i] = result[i];
        }
        return trimmedResult;
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

            RemoveDuplicates obj = new RemoveDuplicates();
            int[] result = obj.removeDuplicates(arr);

            System.out.println("Array after removing1 duplicates:");
            for (int value : result) {
                System.out.print(value + " ");
            }
        }
    }
    
}
