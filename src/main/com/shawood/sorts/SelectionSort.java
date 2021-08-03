package main.com.shawood.sorts;

import java.util.Arrays;

/**
 * @author shawood
 * 选择排序
 *
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,7};
        SelectionSort ss = new SelectionSort();
        System.out.println("res: " + Arrays.toString(ss.Solution_1(nums)));
    }
/**
 * 思路：每次遍历选择最小元素，放到已排序序列的末尾
 */
    public int[] Solution_1(int[] nums){
        int[] res = Arrays.copyOf(nums,nums.length);

        //从头遍历每一个元素与后面未排序元素比较
        for (int i = 0; i < nums.length - 1; i++){
            int min = i;
            
            // 遍历方式找出未排序序列中的最小值的坐标
            for (int j = i+1; j < nums.length - 1; j++){
                if (res[j] < res[min]){
                    min = j;
                }
            }

            // 最小值与res[i]交换位置
            if (i != min){
                int tmp = res[i];
                res[i] = res[min];
                res[min] = tmp;
            }
        }
        return res;
    }
}
