package top_interview_150.two_pointers;
/**
 * EASY
 * https://leetcode.com/problems/valid-palindrome/submissions/1286997804/
 * */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s  = "1a2";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s1.toLowerCase();

        char[] arr = s2.toCharArray();

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
