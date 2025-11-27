class parent{
    public void SayHello(){
        System.out.println("Hello from Parent class");     
    }
}

class child extends parent{
    @Override
    public void SayHello(){
        System.out.println("Hello from Child class");     
    }
}


public class override {
    public static void main(String[] args) {
        parent p = new child();
        p.SayHello();

        parent p1 = new parent();
        p1.SayHello();

    }
}
