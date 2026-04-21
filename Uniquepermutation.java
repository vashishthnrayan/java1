
import java.util.*;

public class Uniquepermutation {
    Set<List<Integer>> ans = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        helper(0,nums,new ArrayList<Integer>());

        List<List<Integer>> listOfList = new ArrayList<>(ans);
        return listOfList;
    }   

    public void helper(int idx, int[] nums, ArrayList<Integer> curr){
        if(idx == nums.length){
            ans.add(new ArrayList<>(curr)   );
            return;
        }   

        for(int i = idx; i < nums.length; i++){
            if (i>idx && nums[i] == nums[i-1]) continue; // Skip duplicates

            curr.add(nums[i]);

            swap(nums, idx, i);

            helper(idx+1, nums, curr);

            swap(nums, idx, i);
            curr.remove(curr.size()-1);
        }
    }
    public void swap(int[] nums, int i, int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    public static void main(String[] args) {
        Uniquepermutation obj = new Uniquepermutation();
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = obj.permuteUnique(nums);
        System.out.println(result);
    }
    
}
