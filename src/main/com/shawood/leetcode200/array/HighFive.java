package main.com.shawood.leetcode200.array;

import java.util.*;

public class HighFive {
    public static void main(String[] args) {
        int[][] scores = {
                {1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}
        };
        int[][] res;
        Solution s = new Solution();
        s.highFive(scores);
    }
}

class Solution {
    public int[][] highFive(int[][] items) {
        int[][] res = new int[1][1];

        List<List<Integer>> aveArr = new ArrayList<>();
        System.out.println(Arrays.deepToString(items));
        Arrays.sort(items);
        return res;
    }
}
