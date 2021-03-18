/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 */
package com.leetcode.excel.twoday;

import java.util.Stack;

public class ExcelReverseSuccess {
    public static void main(String[] args) {
        System.out.println("00 --" + reverse(-321));
    }

    public static int reverse(int num) {
        long result = 0;

        if (num > -10 && num < 10) {
            return num;
        }
        while (num != 0) {
            result = result * 10 + (num % 10);
            num = num / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
























