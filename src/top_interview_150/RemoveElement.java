package top_interview_150;

/**
 * EASY
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Здесь мы проходя по массиву будем перезаписывать все элементы по очереди, но только если они не равны val.
 * Если равны val, то их будем пропускать.
 * Для этого нам опять понадобятся два указателя.
 * Первый - читающий элементы, он в цикле for.
 * Второй который будет пишущий элементы неравные val.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 2, 3};
        int val = 3;
        int countWithoutVal = removeElement(arr, val);
        System.out.println(countWithoutVal);
    }

    private static int removeElement(int[] arr, int val) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}

/*
class Solution {
    public int removeElement(int[] arr, int val) {

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
 */