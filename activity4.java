import java.util.Scanner;
public class activity4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int marks=scn.nextInt();
        if(marks>=91){
            System.out.println("Grade A");
        } else if(marks>=80 && marks<90){
            System.out.println("Grade B");
        } else if(marks>=70 && marks<79){
            System.out.println("Grade C");
        } else if(marks>=60 && marks<69){
            System.out.println("Grade D");
        } else if (marks>=100 ){
            System.out.println("topper");
        }else{
            System.out.println("Fail");
        }
    }
}
