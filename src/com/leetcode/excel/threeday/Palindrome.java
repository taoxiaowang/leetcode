package com.leetcode.excel.threeday;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121121));
    }

    public static boolean isPalindrome(int num) {
        int startNum = num;
        if (num < 0) {
            return false;
        } else {
            long result = 0;
            while (num != 0) {
                result = result * 10 + (num % 10);
                num = num / 10;
            }
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return false;
            }
            if (startNum == result) {
                return true;
            } else {
                return false;
            }
        }
    }
}
