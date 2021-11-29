package easy;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.LinkedList;
import java.util.List;

public class Problem_94 {

    /*
    Name: Merge Sorted Array
    Difficulty: Easy
    Link: https://leetcode.com/problems/merge-sorted-array/
     */

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new LinkedList<>();
        TreeNode now = root;
//        while(true) {
//            if (now.right != null) {
//                continue;
//            } else if (root.left != null)
//        }
        return inorder;

    }    
}


//Definition for a binary tree node.
class TreeNode {
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

