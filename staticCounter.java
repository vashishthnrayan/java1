public class staticCounter {
    int count = 10;

    void increment() {
        count++;
    }
    
    public static void main(String[] args) {
        staticCounter obj1 = new staticCounter();
        staticCounter obj2 = new staticCounter();
        staticCounter obj3 = new staticCounter();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        System.out.println(obj1.count); // Output: 11
        System.out.println(obj2.count); // Output: 11
        System.out.println(obj3.count); // Output: 11
    }
}
