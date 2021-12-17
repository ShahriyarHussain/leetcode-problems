package easy;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.LinkedList;
import java.util.List;

public class Problem_94 {

    /*
    Name: Binary Tree Inorder Traversal
    Difficulty: Easy
    Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
     */

    List<Integer> inorder = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return this.inorder;
        traverseInorder(root);
        return this.inorder;
    }

    public void traverseInorder(TreeNode root) {
        if (root.left != null) traverseInorder(root.left);
        inorder.add(root.val);
        if (root.right != null) traverseInorder(root.right);
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

