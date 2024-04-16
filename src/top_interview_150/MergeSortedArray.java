package top_interview_150;

/**
 * EASY
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 * <p>
 * Сложность в том что нельзя использовать третий массив, а нужно использовать первый с заполненными нулями.
 * Простое решение, это записать второй массив в первый, и вызвать sort.
 * Хорошее решение, это заполнять элементы с конца, т.к. они пустые и использовать 3 указателя,
 * которые будут двигаться каждый по своему массиву, а именно по двум заданным и по итоговому.
 */

public class MergeSortedArray {
    public static void mergeSort(int[] nums1, int[] nums2, int m, int n) {
        int poiner1 = m - 1;
        int poiner2 = n - 1;
        int resultPointer = m + n - 1;

        while (poiner2 >= 0) {
            if (poiner1 >= 0 && nums1[poiner1] >= nums2[poiner2]) {
                nums1[resultPointer] = nums1[poiner1];
                poiner1--;
            } else {
                nums1[resultPointer] = nums2[poiner2];
                poiner2--;
            }
            resultPointer--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        mergeSort(nums1, nums2, m, n);
    }
}
