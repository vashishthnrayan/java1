public class calci {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;

        String magic="==========Magic==========";
        System.out.println("=============Method 1=============");
        System.out.println("Addition of a & b " + sum);
        System.out.println("Subtraction of a & b " + difference);
        System.out.println("Multiplication of a & b " + product);
        System.out.println("Division of a & b " + division);
        System.out.println("=============Method 2=============");
        System.out.println("addition of a & b " + (a + b));
        System.out.println("subtraction of a & b " + (a - b));
        System.out.println("multiplication of a & b " + (a * b));
        System.out.println("division of a & b " + (a / b));
        System.out.println("remainder of a & b " + (a % b));
        System.out.println(magic);
        System.out.println("Addition:"+(a+b)+", Subtraction:"+(a-b)+", Multiplication:"+(a*b)+", Division:"+(a/b)+", Remainder:"+(a%b));
    }
}
