public class StairCase {
    static int CountWays(int n) {
        if (n ==0|| n==1)
            return 1;
        return CountWays(n - 1) + CountWays(n - 2) ;

    }

    public static void main(String[] args) {
        int steps = 4;
        System.out.println("Ways of climb: " + CountWays(steps));
    }
}
