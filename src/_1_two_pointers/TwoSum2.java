package _1_two_pointers;

/**
 * MEDIUM
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4};
        int target = 6;
        int[] twoSum = getTwoSum(arr, target);
        System.out.println(twoSum[0] + " и " + twoSum[1]);

    }

    public static int[] getTwoSum(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }
}
