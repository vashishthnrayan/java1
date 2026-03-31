import java.util.Scanner;
public class IdentifierValidater{
    public boolean isValidIdentifier(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner scn=new Scanner(System.in)){
            IdentifierValidater validator = new IdentifierValidater();

            while (true) {
                System.out.println("Enter an identifier to validate (or 'exit' to quit):");
                String input = scn.nextLine().trim();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                boolean isValid = validator.isValidIdentifier(input);
                if (isValid) {
                    System.out.println("'" + input + "' is a valid identifier.");
                } else {
                    System.out.println("'" + input + "' is not a valid identifier.");
                    System.out.println("Rules for valid identifiers:");
                    System.out.println( "1. Must start with a letter (a-z, A-Z) or an underscore (_).");
                    System.out.println(     "2. Can contain letters, digits (0-9), and underscores.");
                    System.out.println( "3. Not a empty space   .");
                            
                    
                    System.out.println();
                }
            }
        }
    }
}



