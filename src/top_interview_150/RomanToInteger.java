package top_interview_150;

import java.util.Map;

/**
 * EASY
 *
 * https://leetcode.com/problems/roman-to-integer/submissions/1236456719/?envType=study-plan-v2&envId=top-interview-150
 *
 * Создаем маппинг для римских цифр.
 * Пробегаемся по всем символами в римской цифре и
 * если следующий символ меньше по значению то прибавляем его,
 * если больше то отнимаем.
 *
 * */


public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        int i = romanToInteger(s);
        System.out.println(i);
    }

    private static int romanToInteger(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        char[] chars = s.toCharArray();

        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i < s.length() - 1 && map.get(chars[i]) < map.get(chars[i + 1])) {
                result -= map.get(chars[i]);
            } else {
                result += map.get(chars[i]);
            }
        }

        return result;
    }
}
