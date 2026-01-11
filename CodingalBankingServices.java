import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

// ============================
// INTERFACE
// ============================
interface BankingServices {
    void deposit(double amount) throws BankingException;
    void withdraw(double amount) throws BankingException;
    void checkBalance() throws BankingException;
    void viewTransactionHistory() throws BankingException;
    void transfer(String recipientAccount, double amount) throws BankingException;
}

// ============================
// EXCEPTIONS
// ============================
class BankingException extends Exception {
    public BankingException(String msg) { super(msg); }
}

class InsufficientBalanceException extends BankingException {
    public InsufficientBalanceException(double bal, double amt) {
        super("Insufficient balance! Balance: ₹" + bal + " Required: ₹" + amt);
    }
}

class InvalidAmountException extends BankingException {
    public InvalidAmountException(double amt) {
        super("Invalid amount: ₹" + amt);
    }
}

class InvalidMenuOptionException extends BankingException {
    public InvalidMenuOptionException(int ch) {
        super("Invalid menu option: " + ch);
    }
}

class MinimumBalanceException extends BankingException {
    private static final double MIN = 1000;
    public MinimumBalanceException(double bal) {
        super("Minimum balance must be ₹" + MIN + ", Provided: ₹" + bal);
    }
    public static double getMinBalance() { return MIN; }
}

class AccountNotFoundException extends BankingException {
    public AccountNotFoundException(String acc) {
        super("Account not found: " + acc);
    }
}

// ============================
// BANK ACCOUNT
// ============================
class BankAccount implements BankingServices {
    private String name, number;
    private double balance;
    private List<String> history = new ArrayList<>();
    private static final String TFILE = "transactions.txt";
    private static final String AFILE = "accounts.txt";

    // New account constructor
    public BankAccount(String n, String no, double bal) throws BankingException, IOException {
        if (bal < MinimumBalanceException.getMinBalance())
            throw new MinimumBalanceException(bal);

        name = n; number = no; balance = bal;
        String open = "[" + time() + "] Account opened: ₹" + bal;
        history.add(open);
        saveTransaction(open);
        saveAccount();
    }

    // Existing account constructor (login)
    public BankAccount(String n, String no, double bal, boolean existing) {
        name = n; number = no; balance = bal;
    }

    private String time() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    private void saveTransaction(String t) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(TFILE, true))) {
            pw.println("[Account: " + number + "] " + t);
        }
    }

    private void saveAccount() throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(AFILE, true))) {
            pw.println(number + "," + name + "," + balance);
        }
    }

    public void deposit(double amt) throws BankingException {
        if (amt <= 0) throw new InvalidAmountException(amt);
        balance += amt;
        try {
            saveTransaction("Deposit ₹" + amt + " | Balance ₹" + balance);
        } catch (IOException e) { }
    }

    public void withdraw(double amt) throws BankingException {
        if (amt <= 0) throw new InvalidAmountException(amt);
        if (amt > balance) throw new InsufficientBalanceException(balance, amt);
        balance -= amt;
        try {
            saveTransaction("Withdraw ₹" + amt + " | Balance ₹" + balance);
        } catch (IOException e) { }
    }

    public void checkBalance() {
        System.out.println("Account: " + number);
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }

    public void viewTransactionHistory() throws BankingException {
        try (BufferedReader br = new BufferedReader(new FileReader(TFILE))) {
            String line;
            while ((line = br.readLine()) != null)
                if (line.contains(number)) System.out.println(line);
        } catch (IOException e) {
            throw new BankingException("Cannot read transactions file.");
        }
    }

    public void transfer(String acc, double amt) throws BankingException {
        if (!exists(acc)) throw new AccountNotFoundException(acc);
        withdraw(amt);
        try {
            saveTransaction("Transfer to " + acc + " ₹" + amt);
        } catch (IOException e) { }
    }

    private boolean exists(String acc) {
        try (BufferedReader br = new BufferedReader(new FileReader(AFILE))) {
            String line;
            while ((line = br.readLine()) != null)
                if (line.startsWith(acc + ",")) return true;
        } catch (IOException e) { }
        return false;
    }
}

// ============================
// SYSTEM
// ============================
class BankingSystem {
    private Scanner sc = new Scanner(System.in);
    private BankAccount acc = null;

    public void start() {
        while (true) {
            try {
                if (acc == null) {
                    System.out.println("1.Create  2.Login  3.Exit");
                    int ch = Integer.parseInt(sc.nextLine());
                    if (ch == 1) create();
                    else if (ch == 2) login();
                    else break;
                } else {
                    System.out.println("1.Deposit 2.Withdraw 3.Balance 4.History 5.Transfer 6.Logout");
                    int ch = Integer.parseInt(sc.nextLine());
                    if (ch == 1) acc.deposit(readAmt());
                    else if (ch == 2) acc.withdraw(readAmt());
                    else if (ch == 3) acc.checkBalance();
                    else if (ch == 4) acc.viewTransactionHistory();
                    else if (ch == 5) {
                        System.out.print("To: ");
                        acc.transfer(sc.nextLine(), readAmt());
                    }
                    else acc = null;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private double readAmt() {
        System.out.print("Amount: ₹");
        return Double.parseDouble(sc.nextLine());
    }

    private void create() throws Exception {
        System.out.print("Name: "); String n = sc.nextLine();
        System.out.print("Acc No: "); String a = sc.nextLine();
        System.out.print("Opening Balance: ₹"); double b = Double.parseDouble(sc.nextLine());
        acc = new BankAccount(n, a, b);
    }

    private void login() throws Exception {
        System.out.print("Acc No: ");
        String no = sc.nextLine();
        BufferedReader br = new BufferedReader(new FileReader("accounts.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] p = line.split(",");
            if (p[0].equals(no)) {
                acc = new BankAccount(p[1], p[0], Double.parseDouble(p[2]), true);
                System.out.println("Login successful!");
                return;
            }
        }
        throw new AccountNotFoundException(no);
    }
}

// ============================
// MAIN
// ============================
public class CodingalBankingServices {
    public static void main(String[] args) {
        new BankingSystem().start();
    }
}
