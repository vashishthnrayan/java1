import java.util.Scanner;
public class RabinKarp {
    public final static int d = 10;

    static void search(String pat, String txt, int q) {
        int M = pat.length();
        int N = txt.length();
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        for (int i = 0; i < M - 1; i++)
            h = (h * d) % q;

        for (int i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= N - M; i++) {
            if (p == t) {
                int j = 0;
               while(j < M && txt.charAt(i + j) == pat.charAt(j)) {
                    
                    j++;
                }
                if (j == M)
                    System.out.println("Pattern found at index " + (i+1));
            }
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;
                if (t < 0)
                    t = (t + q);
            }
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the text to search in:");
    String txt = sc.nextLine();

    System.out.println("Enter the pattern to search for:");
    String pat = sc.nextLine();

    System.out.println("Enter a prime number for hashing:");
    int q = sc.nextInt();
    search(pat, txt, q);
}}
