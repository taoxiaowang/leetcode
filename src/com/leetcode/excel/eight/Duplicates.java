package com.leetcode.excel.eight;

public class Duplicates {
    public static void main(String[] args) {
        int[] array = new  int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 1 ;
        for (int i = 1 ; i < nums.length ; i++){
            if(nums[index -1] != nums[i]){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}
