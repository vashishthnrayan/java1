import java.util.Scanner;
public class ex1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x+" / " +y+" = " +z+"\n");
        }catch(ArithmeticException ex){
            System.out.println("--------cath block--------");
            System.out.println(ex.toString());
        }finally{
            System.out.println("--------finally block--------");
            System.out.println("Accomplished Designed & Developed by");
            System.out.println("Vashishth narayan");
            sc.close();
        }
        System.out.println("----------------------------------------------------DONE----------------------------------------------------");
    }
    
}