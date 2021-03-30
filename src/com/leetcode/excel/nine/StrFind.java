package com.leetcode.excel.nine;

public class StrFind {
    public static void main(String[] args) {
       String haystack = "aaaca";
       String needle = "ac";
       System.out.println("num =" + strStr(haystack,needle));
    }


    public static int strStr(String haystack, String needle) {
        char[] stackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int M = needleChar.length;
        int N = stackChar.length;
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (needleChar[j] != stackChar[i+j])
                    break;
            }
            // pat 全都匹配了
            if (j == M) return i;
        }
        // txt 中不存在 pat 子串
        return -1;
    }
}
