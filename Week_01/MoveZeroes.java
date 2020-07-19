package practice;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int firstZero = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                swap(nums, firstZero++, cur);
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
