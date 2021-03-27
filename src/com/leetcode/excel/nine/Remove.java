package com.leetcode.excel.nine;

public class Remove {

    public static void main(String[] args) {

        int[] array = new  int[] {0,0,1,1,1,2,2};
        System.out.println(removeDuplicates(array,1));

    }

    public static int removeDuplicates(int[] nums,int value) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0 ;
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] != value){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}
