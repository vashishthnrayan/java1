import java.util.*;
public class Permutation {

    public List<List<Integer>> permutation(int[] nums ) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        int[] curr = new int[nums.length];
        backtrack(nums, used,curr,0, result);

        return result;

    }
    public void backtrack(int[] nums, boolean[] used, int[] curr, int index, List<List<Integer>> result){
        if(index == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : curr){
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr[index] = nums[i];
            backtrack(nums, used, curr, index + 1, result);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        Permutation obj = new Permutation();
        int[] nums = {1, 2, 3};
        System.out.println(obj.permutation(nums));
    }
}
