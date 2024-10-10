package main.com.shawood.sorts;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 1, 5, 2};
        // 外循环
        for (int i = 1; i < nums.length; i++) {
            int base = nums[i], j = i - 1;
            while (j >= 0 && nums[j] > base) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = base;
        }
        System.out.println(Arrays.toString(nums));
    }
}
