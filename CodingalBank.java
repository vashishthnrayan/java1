import java.io.*;
import java.util.*;

// User-defined exception for invalid menu choice
class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String msg) {
        super(msg);
    }
}

// User-defined exception for minimum balance
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}

// Banking Interface
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws MinimumBalanceException;
    void display();
}

// Main class
public class CodingalBank implements BankService {
    double balance = 1000; // Opening balance

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 500) {
            throw new MinimumBalanceException("Minimum balance of 500 must be maintained!");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }

    public void display() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodingalBank acc = new CodingalBank();
        System.out.println("Welcome to Codingal Bank\n");
        System.out.println("Initial Balance: " + acc.balance);

        try {
            System.out.println("1. Deposit\n2. Withdraw\n3. Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 3) {
                throw new InvalidChoiceException("Invalid menu option selected!");
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    acc.display();
                    break;
            }

            // File Handling
            FileWriter fw = new FileWriter("account.txt");
            fw.write("Final Balance: " + acc.balance);
            fw.close();
            System.out.println("Account details saved to file.");

        } catch (InvalidChoiceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File Error!");
        }
    }
}

