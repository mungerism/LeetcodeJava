package com.utopia.leetcode.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 迭代的形式和终止条件是什么
 * 形式：循环
 * 条件：栈不为空
 * 树的遍历只要一个指针
 * 栈的作用：保存回溯到父节点
 */
public class N144PreorderTraversal1 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null){
            if (root == null){
                root = stack.pop();
                root = root.right;
            } else {
                stack.push(root);
                res.add(root.val);
                root = root.left;
            }
        }

        return res;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
    }
}
