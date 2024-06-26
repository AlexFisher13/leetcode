package binary_search;

/**
 * EASY
 * https://leetcode.com/problems/first-bad-version/description/
 */
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int badVersion = 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                badVersion = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return badVersion;
    }

    private static boolean isBadVersion(int version) {
        return version == 4;
    }
}
