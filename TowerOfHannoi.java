
import java.util.Scanner;

public class TowerOfHannoi {
    public static void toh(int n , int t1,int t2, int t3){
        if(n==0){
            return;
        }
        // Move n-1 disks from t1 to t2 using t3 as auxiliary
        toh(n-1, t1, t3, t2);
        System.out.println("Move disk " + n + " from tower " + t1 + " to tower " + t3);

        // Move n-1 disks from t2 to t3 using t1 as auxiliary
        toh(n-1, t2, t1, t3);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of disks:");

        int n = scn.nextInt();

        System.out.println("Enter the number of the fist tower:");
        int t1 = scn.nextInt();

        System.out.println("Enter the number of the second tower:");
        int t2 = scn.nextInt();

        System.out.println("Enter the number of the third tower:");
        int t3 = scn.nextInt();


        toh(n, t1, t2, t3);
    }
}
