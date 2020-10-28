package com.utopia.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class N144PreorderTraversal {

    private List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        recursive(root);
        return res;
    }

    private void recursive(TreeNode root){

        if (root == null){
            return;
        }

        res.add(root.val);
        recursive(root.left);
        recursive(root.right);
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
