import java.util.Scanner;

public class LongestPalindrome {
    public String longestPalindrome(String str){
         int n = str.length();
            boolean[][] IsPalindrome = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                IsPalindrome[i][i] = true;
            }   

            for(int i = 0; i < n-1; i++){
                if(str.charAt(i) == str.charAt(i+1)){
                    IsPalindrome[i][i+1] = true;
                }
            }   
            for(int length = 3; length <= n; length++){
                for(int i = 0; i < n-length+1; i++){
                    int j = i + length - 1;
                    if(str.charAt(i) == str.charAt(j) && IsPalindrome[i+1][i+length-2   ]){
                        IsPalindrome[i][j] = true;
                    }
                }
            }
            int start = 0;
            int end = 0;
            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    if(IsPalindrome[i][j] && (j - i > end - start)){
                        start = i;
                        end = j;
                    }
                }
            }
            return str.substring(start, end + 1);

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            LongestPalindrome obj = new LongestPalindrome();

            System.out.println("Enter a string to find the longest palindromic substring:");
            String input = sc.nextLine();

            String result = obj.longestPalindrome(input);
            System.out.println("Longest palindromic substring: " + result);
        }
    }
}