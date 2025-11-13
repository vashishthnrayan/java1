import java.util.Scanner;
public class MaxMinInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do{
            System.out.print("Enter a number: ");
            number = scn.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.err.print("Do you want to countinue? (y/n): ");
            choice = scn.next().charAt(0);
       
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Largest value is: " + max);
        System.out.println("Smallest value is: " + min);
    }
}
