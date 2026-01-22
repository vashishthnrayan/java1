import java.util.ArrayList;
import java.util.Scanner;


public class ArraylistTrials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of integers you want to input:");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter size of arraylist " + (i + 1) + ":");
            int nl = sc.nextInt();

            ArrayList<Integer> l2 = new ArrayList<>();

            System.out.println("Enter the " + nl + " integers for arraylist " + (i + 1) + ":");
            for (int j = 0; j < nl; j++) {
                l2.add(sc.nextInt());
            }   
            list.add(i,l2);
        }

        System.out.println("Enter the number of queries to process:");
        int num= sc.nextInt();

        for (int k = 0 ; k < num; k++) {
            System.out.println("Enter the query (list index and element index):");
            int m = sc.nextInt();
            int o = sc.nextInt();

            try {
                System.out.println("Element at ("+m+","+o+") : " + list.get(m-1).get(o-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
          }   
        }
    }
}
