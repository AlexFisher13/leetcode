package _1_two_pointers.main;

/**
 * EASY
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Два указателя. Первый указывает на уникальный элемент. Второй проходит по всем остальным и сравнивает с уникальным.
 * Когда попадается не дубль - мы записываем его в следующую ячейку от уникального.
 * */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 3};
        int k = removeDuplicates(arr);
        System.out.println(arr);
    }

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return ++i;
    }
}
