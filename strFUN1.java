import java.util.Scanner;
public  class strFUN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter the length of the string: ");
        int n = sc.nextInt();

        System.out.println("Enter the string:");
        sc.nextLine(); // Consume the newline character
        String original = sc.nextLine();

        System.out.println("The original string is: " + original);

        String reverse = new StringBuilder(original).reverse().toString();
        System.out.println("The reversed string is: " + reverse );

        System.out.println("The length of the string is: " + original.length());
        

    }
}