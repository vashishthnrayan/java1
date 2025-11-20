public class Employee {
    int empno;
    String name;
    float salary;

    Employee() {
        System.out.println("******");
        empno = 101;
        name = "John Doe";
        salary = 45010.50f;

    }

    void DisplayOutput(){
        System.out.println(empno + " | " + name + " | " + salary);
    }  
}

