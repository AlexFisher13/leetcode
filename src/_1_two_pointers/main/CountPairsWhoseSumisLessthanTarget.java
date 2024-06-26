package _1_two_pointers.main;

import java.util.Collections;
import java.util.List;

/**
 * EASY
 * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
 * Нам нужно сранивать все элементы друг с другом и искать их сумму.
 * Но если мы отсортируем массив то мы быстро сможет много элементов откинуть.
 * Мы пойдем указателями с двех сторон и начнем сравнивать элементы с таргетом.
 * И сдвигать укзаатели в ту сторону, которая нас будет приближать к таргету.
 */
public class CountPairsWhoseSumisLessthanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        while(left < right){
            if(nums.get(left) + nums.get(right) < target) {
                count += right-left;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}
