package binary_search;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid = -1;

        while(left <= right) {
            mid = left + (right - left) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid > x / mid) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
