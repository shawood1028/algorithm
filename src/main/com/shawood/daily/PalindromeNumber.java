package main.com.shawood.daily;

import java.util.Arrays;
import java.util.List;

/**
 * @author shawood
 */
public class PalindromeNumber {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPalindrome(int x) {
//        特殊情况
//        负数不是回文数
        if (x < 0 || x % 10 == 0 && x != 0 ){
            return false;
        }

        int revertedNumber = 0;

        while (x > revertedNumber){
            revertedNumber = revertedNumber * 10 + x % 10;
            x = x / 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
