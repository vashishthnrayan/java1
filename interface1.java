interface MyInterface {
    public void method1();
    public void method2();

}
class interface1 implements MyInterface {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }

    public static void main(String[] args) {
        MyInterface obj = new interface1();
        obj.method1();
        obj.method2();
    }
}
