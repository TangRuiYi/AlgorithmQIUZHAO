package practice;

public class RemoveDuplicates1 {
    public static int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r = 1; r < nums.length; r++) {
            if (nums[l] < nums[r]) nums[++l] = nums[r];
        }
        return l + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }
}
