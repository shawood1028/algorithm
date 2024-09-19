package main.com.shawood.leetcode200.array.missingranges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    题集: LeetCode精选算法200题
    题目编号及名称：163.缺失的区间
*/

public class MissingRanges {
    public static void main(String[] args) {
//        int[] testList ={0,1,3,50,75};
//        int[] testList2 ={-1,-1};
        int[] testList3 = {-1};
        int[] testList4 = {0,1};
        List<List<Integer>> res =new Solution().findMissingRanges(testList4, 0, 1);
        System.out.println(res);
    }
}

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> interval = new ArrayList<>();
        List<Integer> buf = new ArrayList<>();
        if (nums.length == 0) {
            buf = Arrays.asList(lower,upper);
            interval.add(buf);
            return interval;
        }

        if (lower < nums[0]) {
            buf = Arrays.asList(lower,nums[0]-1);
            interval.add(buf);
        }

        for (int i=0; i<nums.length-1; i++){
            if (nums.length>=2 && (nums[i+1]-nums[i])>=2 && nums[i] >= lower && nums[i+1] <= upper){
                buf = Arrays.asList(nums[i]+1, nums[i+1] -1);
                interval.add(buf);
            }
        }

        if (upper>nums[nums.length-1]) {
            buf = Arrays.asList(nums[nums.length-1]+1,upper);
            interval.add(buf);
        }
        return interval;
    }
}


class Solution2 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        long pre = (long)lower - 1; // prevent 'int' overflow
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - pre == 2) res.add(String.valueOf(pre + 1));
            else if (nums[i] - pre > 2) res.add((pre + 1) + "->" + (nums[i] - 1));
            pre = nums[i]; // 'int' to 'long'
        }
        if (upper - pre == 1) res.add(String.valueOf(pre + 1));
        else if (upper - pre > 1) res.add((pre + 1) + "->" + upper);
        return res;
    }
}

/*
    leetcode优雅题解
* */
class Solution3 {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ranges = new ArrayList<>();

        // 遍历nums中的数字
        for (int num : nums) {
            if (lower < num) {
                // 将区间[lower, num-1]添加进结果集
                ranges.add(Arrays.asList(lower, num - 1));
            }
            lower = num + 1;
        }

        // 遍历完nums之后 如果发现lower依然小于upper
        // 说明这段是缺失的，添加进结果集
        if (lower <= upper) {
            ranges.add(Arrays.asList(lower, upper));
        }

        return ranges;
    }
}