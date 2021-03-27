package com.leetcode.excel.seven;

public class ListNodeMerge {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);


        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);

        head.next = node1;
        node1.next = node2;


        node3.next = node4;
        node4.next = node5;
        ListNode result = mergeTwoLists(head, node3);
        while (result != null){
            System.out.print(result.val + " -");
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode listOne, ListNode listTwo) {
        ListNode resultList = new ListNode();
        ListNode tempNode = resultList;
        while(listOne != null
                && listTwo != null){
            int valueOne = listOne.val;
            int valueTow = listTwo.val;
            if(valueOne > valueTow){
                resultList.next = listTwo;
                resultList = resultList.next;
                listTwo = listTwo.next;
            }else{
                resultList.next = listOne;
                resultList = resultList.next;
                listOne = listOne.next;
            }
        }
        if(listTwo == null){
            resultList.next = listOne;
        }else{
            resultList.next = listTwo;
        }
        return  tempNode.next;
    }
}
