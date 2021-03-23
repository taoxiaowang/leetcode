package com.leetcode.excel.four;

import java.util.HashMap;


//I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            if((i + 1) >= num.length()){
                break;
            }
            if (map.get(num.charAt(i)) < map.get(num.charAt(i + 1)))
                sum -= map.get(num.charAt(i));
            else
                sum += map.get(num.charAt(i));
        }
        sum += map.get(num.charAt(num.length() - 1));

        return sum;
    }
}
