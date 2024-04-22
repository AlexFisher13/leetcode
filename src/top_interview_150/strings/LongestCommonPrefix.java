package top_interview_150.strings;

/**
 * EASY
 * https://leetcode.com/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150
 *
 * Тут важно не ошибиться, надо не просто найти большую общую последовательность символов,
 * а имнно префикс, то есть общее начало строки.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }


    private static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);

        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(sb.toString())) {
                sb.deleteCharAt(sb.length()-1);
                i = 0;
            }
        }

        return sb.toString();
    }
}
