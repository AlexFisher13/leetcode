package top_interview_150.two_pointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * EASY
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 * Пересечение массивов имеется ввиду просто списк чисел, а не непрерывный участок.
 *
 */
public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 5, 6, 8};
        int[] nums2 = new int[]{8, 6, 8};
        getIntersection(nums1, nums2);
    }

    public static int[] getIntersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0;
        int p2 = 0;

        List<Integer> result = new LinkedList<>();

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
