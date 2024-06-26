package _1_two_pointers.main;

/**
 * EASY
 * https://leetcode.com/problems/merge-sorted-array/description/
 * Сложность в том что нельзя использовать третий массив, а нужно использовать первый с заполненными нулями.
 * Простое решение, это записать второй массив в первый, и вызвать sort.
 * Хорошее решение, это заполнять элементы с конца, т.к. они пустые и использовать 3 указателя,
 * которые будут двигаться каждый по своему массиву, а именно по двум заданным и по итоговому.
 */

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] >= nums2[p2]) {
                nums1[pMerge] = nums1[p1];
                p1--;
            } else {
                nums1[pMerge] = nums2[p2];
                p2--;
            }
            pMerge--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
