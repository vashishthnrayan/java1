import java.util.Scanner;

public class EvenOddWhile {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the limit: ");

int limit = sc.nextInt();

int i = 1; // starting number

System.out.println("Even and Odd numbers up to " + limit + ":");


while (i <= limit) {

if (i % 2 == 0) {

System.out.println(i + " is Even");

} else {

System.out.println(i + " is Odd");

}

i++; // increment

}

sc.close();

}

}