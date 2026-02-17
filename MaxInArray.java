public class MaxInArray {
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxOfRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }
    public static void main(String[] args) {
        int[] nums = {3,  7, 2, 9};
       System.out.println(findMax(nums, 0));
    }
}
