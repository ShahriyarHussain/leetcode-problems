package easy;

/*
    Name: Maximum Depth of Binary Tree
    Difficulty: Easy
    Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
*/

public class Problem_104 {

    public int maxDepth(TreeNode root) {
        return traverseTree(root, 0);
    }

    public int traverseTree(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }

        return Integer.max(traverseTree(root.left, depth + 1),
                traverseTree(root.right, depth + 1));
    }
}
