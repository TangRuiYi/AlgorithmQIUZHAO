package practice;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int e1 = m - 1;
        int e2 = n - 1;
        while (e1 >= 0 && e2 >= 0) {
            nums1[e1 + e2 + 1] = nums1[e1] < nums2[e2] ? nums2[e2--] : nums1[e1--];
        }
        System.arraycopy(nums2, 0 , nums1, 0, e2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
