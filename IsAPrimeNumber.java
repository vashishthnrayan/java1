import java.util.Scanner;
public class IsAPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.println("how many numbers you want to check:");
        int t=scn.nextInt();
        for(int i=1; i <= t;i++){
            System.out.println("Enter the number to check :");
            int n=scn.nextInt();
            int count=0;
            for(int div=2 ; div*div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count==0 ){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }    
}
