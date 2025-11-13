import java.util.Scanner;

public class WhileLoopActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= 0;

        while (number >= 0) {
            System.out.print("Enter a number (negative to quit): ");
            number = sc.nextInt();
            if (number >= 0) {
                System.out.println("You entered: " + number);
            }
        }
        
        System.out.println("Loops ended because a negative number was entered.");
        sc.close();
        
    }    
}
