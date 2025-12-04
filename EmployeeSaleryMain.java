
import java.util.Scanner;

public class EmployeeSaleryMain {
    public static Employee getEmployeeDetails()  {
        Scanner scanner = new Scanner(System.in);
        int id ;
        String name ;
        double salery;

        System.out.println("Enter Id:");
        id = scanner.nextInt();

        System.out.println("Enter Name:");
        name = scanner.next();

        System.out.println("Enter Salery:");
        salery = scanner.nextDouble();
        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setEmployeeSalery(salery);

        return employee;


    }


    
    public static int getPFPercentage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PF Percentage:");
        return scanner.nextInt();
    }



    public static void main(String[] args) {
        Employee employee = getEmployeeDetails();
        int pfp=getPFPercentage();
        employee.calculateNetSalery(pfp);

        System.out.println("Id"+employee.getEmployeeId());
        System.out.println("Name"+employee.getEmployeeName());
        System.out.println("Salery"+employee.getEmployeeSalery());
        System.out.println("Net Salery"+employee.getNetSalery());
    }

    static  class  Employee{
        private int id;
        private String name;
        private double salery;
        private double netSalery;


        public int getEmployeeId() {
            return id;
        }

        public void setEmployeeId(int id) {
            this.id = id;
        }

        public String getEmployeeName() {
            return name;
        }

        public void setEmployeeName(String name) {
            this.name = name;
        }

        public double getEmployeeSalery() {
            return salery;
        }

        public void setEmployeeSalery(double salery) {
            this.salery = salery;
        }

        public double getNetSalery() {
            return netSalery;
        }

        public void calculateNetSalery(int pfPercentage) {
            double pfAmount =  (salery * pfPercentage / 100);
            this.netSalery = salery - pfAmount;
        }
    }
}
