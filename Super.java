class SuperClass{
    int num=56;
}
class SubClass extends SuperClass{
   int num=96;
   void printnumber(){
        System.out.println(num);
   }
}

public class Super {
    public static void main(String[] args) {
        SubClass sub=new SubClass();
        sub.printnumber();
    }
}
