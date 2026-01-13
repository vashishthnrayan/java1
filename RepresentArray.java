
import java.util.Scanner;

public class RepresentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the row: ");
        int row = sc.nextInt();

        System.out.print("Enter the size of the column: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }   
        System.out.println(1);
        System.out.println("the entered 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }   
    }
}
