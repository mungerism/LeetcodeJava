package com.utopia.leetcode.codinginterviews;

/**
 * 递归的本质就是栈
 */
public class N6ReversePrint {
    int [] resArray;
    int size;
    int i;

    public int[] reversePrint(ListNode head) {
        recurse(head);
        return resArray;
    }

    private void recurse(ListNode head){

        if (head == null){
            resArray = new int[size];
            return;
        }

        size++;
        recurse(head.next);
        resArray[i] = head.val;
        i++;

    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
