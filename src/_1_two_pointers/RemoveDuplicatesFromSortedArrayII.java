package _1_two_pointers;

/**
 * MEDIUM
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * */
public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = removeDuplicates(nums);
        System.out.println(nums);
    }

    public static int removeDuplicates(int[] nums) {
        // Проверяем, не является ли массив nums пустым или равным нулю
        if (nums == null || nums.length == 0) {
            return 0; // Если да, то возвращаем 0, так как нет дубликатов
        }

        int slow = 0; // Инициализируем медленный указатель
        int count = 1; // Счётчик для отслеживания количества встреченных элементов

        // Проходим по массиву начиная со второго элемента (fast = 1)
        for (int fast = 1; fast < nums.length; fast++) {
            // Если текущий элемент равен предыдущему
            if (nums[fast] == nums[slow]) {
                count++; // Увеличиваем счётчик
                // Если количество не превышает 2, то мы можем добавить элемент
                // к результату и сместить медленный указатель
                if (count <= 2) {
                    slow++; // Смещаем медленный указатель
                    nums[slow] = nums[fast]; // Записываем текущий элемент
                }
            } else {
                // Если текущий элемент отличается от предыдущего
                slow++; // Смещаем медленный указатель
                nums[slow] = nums[fast]; // Записываем текущий элемент
                count = 1; // Сбрасываем счётчик
            }
        }

        // Возвращаем количество уникальных элементов в массиве (slow + 1)
        return slow + 1;
    }
}