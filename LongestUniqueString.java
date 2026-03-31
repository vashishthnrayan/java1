import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class LongestUniqueString {
    public String longestUniqueSubstring(String str) {
        Set<Character> seen = new HashSet<>();
        int start  = 0;
        String longest = "";

        for(int i = 0 ; i < str.length(); i++){
            char currentChar = str.charAt(i);
            while(seen.contains(currentChar)){
                seen.remove(str.charAt(start));
                start++;
            }
            seen.add(currentChar);
            if(i - start + 1 > longest.length()){
                longest = str.substring(start, i + 1);
            }
            
        }
        return longest;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LongestUniqueString obj = new LongestUniqueString();

        System.out.println("Enter a string to find the longest substring without repeating characters:");
        String input = sc.nextLine();

        String result = obj.longestUniqueSubstring(input);  
        System.out.println("longest unique substring: " + result);
    }
}
