import java.util.Scanner;
public class sumtilln  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }

        System.out.println("Sum tll"+n+"is---"+sum);
    }
}