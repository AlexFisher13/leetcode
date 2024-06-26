package _3_binary_search;

/**
 * EASY
 * https://leetcode.com/problems/valid-perfect-square/description/
 * при использовании пограничных значений, можем не уместиться в int, поэтому лучше брать long
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        long mid = 0;

        while(left <= right) {
            mid = left + (right - left)/2;
            System.out.println(mid);
            if(mid*mid == num) {
                return true;
            } else if (mid*mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
