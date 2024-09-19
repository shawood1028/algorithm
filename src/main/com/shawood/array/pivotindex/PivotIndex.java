package main.com.shawood.array.pivotindex;


import java.util.Arrays;

/**
 * @author shawood
 * 寻找数组中心索引
 * */
public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int total = Arrays.stream(nums).sum();
        System.out.println(total);
        PivotIndex p = new PivotIndex();
        System.out.println(p.Solution_1(nums));
    }

    /**
     * 暴力解法
     * 思路 : 遍历数组下标，判断左右侧元素想加之和是否相等
     */
    public int Solution_1(int[] nums){

        // 如果数组长度为0，则数组无中心索引
        if(nums.length == 0){
            return -1;
        }

        // 数组长度不为0时，判断是否有中心索引
        // 根据中心索引位置，判断左右侧之和是否相等
        for (int i = 0; i < nums.length; i++){
            // 重置左右侧和值
            int lsum = 0,rsum = 0;

            // 计算左侧之和
            for (int j = 0; j < i; j ++){
                lsum += nums[j];
            }

            // 计算右侧之和
            for (int k = i + 1; k < nums.length; k ++){
                rsum += nums[k];
            }

            // 判断左右侧之和是否相等
            if (lsum == rsum){
                return i;
            }
        }

        return -1;
    }
}
