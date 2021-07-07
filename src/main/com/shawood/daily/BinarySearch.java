package main.com.shawood.daily;

import java.util.Arrays;

/**
 * @author shawood
 * 二分查找
 * 升序数组，找到目标值
 */
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearchSolution bss = new BinarySearchSolution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(bss.search(nums, target));
    }
}

class BinarySearchSolution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0, pivot = 0;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }
}
