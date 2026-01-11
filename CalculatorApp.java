import java.util.*;

// Base Class
class BasicCalculator {
    double add(double a, double b) { return a + b; }
    double subtract(double a, double b) { return a - b; }
}

// Level 2
class AdvancedCalculator extends BasicCalculator {
    double multiply(double a, double b) { return a * b; }
    double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }
}

// Level 3 (Lowest Child)
class ScientificCalculator extends AdvancedCalculator {
    double power(double a, double b) { return Math.pow(a, b); }
    double squareRoot(double a) {
        if (a < 0) throw new ArithmeticException("Negative number!");
        return Math.sqrt(a);
    }
}

// Main App
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        while (true) {
            try {
                System.out.println("\n===== ADVANCED CALCULATOR =====");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Power");
                System.out.println("6. Square Root");
                System.out.println("7. Exit");

                System.out.print("Choose operation: ");
                int ch = sc.nextInt();

                if (ch == 7) {
                    System.out.println("Calculator Closed.");
                    break;
                }

                if (ch == 6) {
                    System.out.print("Enter number: ");
                    double a = sc.nextDouble();
                    System.out.println("Result = " + calc.squareRoot(a));
                } else {
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();

                    switch (ch) {
                        case 1: System.out.println("Result = " + calc.add(a, b)); break;
                        case 2: System.out.println("Result = " + calc.subtract(a, b)); break;
                        case 3: System.out.println("Result = " + calc.multiply(a, b)); break;
                        case 4: System.out.println("Result = " + calc.divide(a, b)); break;
                        case 5: System.out.println("Result = " + calc.power(a, b)); break;
                        default: System.out.println("Invalid choice!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
