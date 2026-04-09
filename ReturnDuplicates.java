import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class ReturnDuplicates {
    public int[] findDuplicates(int[] arr) {
        Set<Integer> uniqueValue = new HashSet<>();
        Set<Integer> duplicatesValue = new HashSet<>();

        for (int num : arr) {
            if (uniqueValue.add(num)) {
                duplicatesValue.add(num);
            } 
        }

        int[] result = new int[duplicatesValue.size()];
        int index = 0;
        for (int num : duplicatesValue) {
            result[index++] = num;
            index++;    
        }
        return result;
    }

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            ReturnDuplicates obj = new ReturnDuplicates();

            System.out.println("enter the size of the array:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] result = obj.findDuplicates(arr);
            System.out.println("duplicates in the array are:");
            if(result.length >0){
                System.out.println("duplicate found in the array:");
                for (int num : result) {
                    System.out.println(num+"");

                }}else{
                    System.out.println("no duplicate found in the array:");
                }
            }   
        }
    }

 