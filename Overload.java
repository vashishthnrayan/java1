public class Overload {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(785,"Ashish");
        Student st3 = new Student(456,"Rajesh",78.90f);
        st1.DisplayOutput();
        st2.DisplayOutput();
        st3.DisplayOutput();
    }
}

class Student {
    int id;
    String name;
    float stipend;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(int id, String name, float stipend) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }
    void DisplayOutput() {
        System.out.println(id + " | " + name + " | " + stipend);
    }

    
}
