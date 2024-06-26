package _1_two_pointers;

/**
 * EASY
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 * Нужно поменять гласные в строке.
 * Будем идти указателями с разных стороны и менять гласнык
 */
public class ReverseVowelsString {
    public static void main(String[] args) {
        String s = reverseVowels("ai");
        System.out.println(s);
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 <= p2) {
            if(isVowels(arr[p1])) {
                if(isVowels(arr[p2])) {
                    char tmp = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = tmp;
                    p1++;
                    p2--;
                } else {
                    p2--;
                }
            } else {
                p1++;
            }
        }

        return new String(arr);
    }

    public static boolean isVowels(char c) {
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i<vowels.length; i++) {
            if(c == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}
