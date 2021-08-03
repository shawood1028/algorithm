package main.com.shawood.sorts;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author shawood
 * 冒泡排序
 * 仅用于自己学习使用
 */
public class BubbleSort {
    public static void main(String[] args) {

    }

    /**
     * @author 菜鸟教程
     */
    public int[] Solution_1(int[] nums){
        // 对arr进行拷贝，不改变参数内容
        int[] res = Arrays.copyOf(nums,nums.length);
        for (int i=1; i < nums.length; i ++){
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < nums.length -i; j ++){
                if (res[j] > res[j + 1]){
                    int tmp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = tmp;

                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return res;
    }
}
