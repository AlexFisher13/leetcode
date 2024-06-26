package _4_stack;

import java.util.Stack;

/**
 * EASY
 * https://leetcode.com/problems/backspace-string-compare/description/
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";

        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = getStack(s);
        Stack<Character> tStack = getStack(t);

        StringBuilder sB = getStringBuilder(sStack);
        StringBuilder tB = getStringBuilder(tStack);

        return sB.compareTo(tB) == 0;
    }

    private static StringBuilder getStringBuilder(Stack<Character> stack) {
        StringBuilder sB = new StringBuilder();
        while (!stack.isEmpty()) {
            sB.append(stack.pop());
        }
        return sB;
    }

    private static Stack<Character> getStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack;
    }
}
