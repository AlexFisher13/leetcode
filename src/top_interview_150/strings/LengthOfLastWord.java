package top_interview_150.strings;

/**
 * EASY
 * <a href="https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].toCharArray().length;
    }
}
