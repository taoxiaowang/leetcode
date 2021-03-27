package com.leetcode.excel.six;

import java.util.HashMap;
import java.util.Stack;

public class ValidString {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{"));
    }
    public static boolean isValid(String value) {
        if(value == null || value.length() <= 0){
            return false;
        }
        int length = value.length();
        if(length % 2 != 0){
            return false;
        }
        String curChar = value.substring(0,1);
        Stack<String> stackInfo = new Stack<>();
        stackInfo.push(curChar);
        for(int i = 1 ; i < value.length() ; i++){
            curChar = value.substring(i,(i + 1));
            if(stackInfo.isEmpty()){
                stackInfo.push(curChar);
                continue;
            }
            String topChar = stackInfo.peek();
            if("(".equals(topChar) && ")".equals(curChar)){
                stackInfo.pop();
            }else if("{".equals(topChar) && "}".equals(curChar)){
                stackInfo.pop();
            }else if("[".equals(topChar) && "]".equals(curChar)){
                stackInfo.pop();
            }else {
                stackInfo.push(curChar);
            }
        }
        return stackInfo.isEmpty();
    }
}
