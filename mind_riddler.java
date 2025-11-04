public class mind_riddler {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("============Gess the Asnwer============");
        System.out.println("Uninary Operater"+(a++));
        System.out.println("Uninary Operater"+(++b));
        System.out.println("Bianry Operater");
        System.out.println("1+2"+1+2);
        System.out.println("1+2"+(1+2));
        System.out.println(1+2+"=3");
        int increment = ++a*++b;
        System.out.println("Increment Value:"+increment);
        System.out.println("Ternany Operater");
        int largesNumber = (a>b)?a:b;
        System.out.println("Larges Number is:"+largesNumber);

    }
}
