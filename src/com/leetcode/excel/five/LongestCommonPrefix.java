package com.leetcode.excel.five;
//
//编写一个函数来查找字符串数组中的最长公共前缀。
//
//        如果不存在公共前缀，返回空字符串 ""。
//
//         
//
//        示例 1：
//
//        输入：strs = ["flower","flow","flight"]
//        输出："fl"
//        示例 2：
//
//        输入：strs = ["dog","racecar","car"]
//        输出：""
//        解释：输入不存在公共前缀。
//         
//
//        提示：
//
//        0 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//        strs[i] 仅由小写英文字母组成
//        通过次数475,636提交次数1,210,685

public class LongestCommonPrefix {
    public static void main(String[] args) {
       String[] strs = new String[] {"flower","flow","flight"};
       System.out.println("first = "+  longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
