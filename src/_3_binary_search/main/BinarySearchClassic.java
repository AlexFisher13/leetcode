package _3_binary_search.main;

/**
 * EASY
 * https://leetcode.com/problems/binary-search/description/
 */
public class BinarySearchClassic {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1; // т.к. мы не учитываем сам средний элемент, мы сдвигаемся от него
            } else {
                left = mid + 1; // т.к. мы не учитываем сам средний элемент, мы сдвигаемся от него
            }
        }
        return -1;
    }
}
