import java.util.HashSet;
public class SimpleSetExample{
    public static void main (String[] args ){
        int[] arr =  {1,2,3,4,5,1};
        HashSet<Integer>set= new HashSet<>();
        
        System.out.println("Duplicates in the array:");

        for(int num:arr){
            if(set.contains(num)){
                System.out.println(num);
            }else{
                set.add(num);
            }
        }

        System.out.println("Unique elements in the array:");
        System.out.println(set);
    }
}