
import java.util.Scanner;

public class spiralArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        if (rows == 0 || cols == 0) {
            System.out.println("Array dimensions must be greater than zero.");
            return;
        }

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int rmin = 0, rmax = rows - 1, cmin = 0, cmax = cols - 1;
        int count = 0;

        System.out.println("Spiral order traversal of the array:");
        while (count < rows * cols) {
            // Traverse from left to right
            for (int col = cmin; col <= cmax && count < rows * cols; col++) {
                System.out.print(array[rmin][col] + " ");
                count++;
            }
            rmin++;

            // Traverse from top to bottom
            for (int row = rmin; row <= rmax && count < rows * cols; row++) {
                System.out.print(array[row][cmax] + " ");
                count++;
            }

            cmax--;
            
            // Traverse from right to left
            for (int col = cmax; col >= cmin && count < rows * cols; col--) {
                System.out.print(array[rmax][col] + " ");
                count++;
            }
            rmax--;
            for (int row = rmax; row >= rmin && count < rows * cols; row--) {
                System.out.print(array[row][cmin] + " ");
                count++;
            }
        }
    }
}
