import java.util.Scanner;

public class PrimeFactorizationofANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factorization:");
        int n = scn.nextInt();
        System.out.print("Prime factorization of " + n + " is: ");
        
        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                System.out.print(div + " ");
                n=n/div;
                System.err.println(div+"");
            }
        }
        
        if (n != 1) {
            System.out.print(n);
        }
        
        
    }    
}
