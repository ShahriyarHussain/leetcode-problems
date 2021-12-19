package easy;

public class Problem_112 {
    /*
    Name: Path Sum
    Difficulty: Easy
    Link: https://leetcode.com/problems/path-sum/
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        targetSum -= root.val;
        if (targetSum == 0)
            if (root.right == null && root.left == null) return true;

        if (hasPathSum(root.left, targetSum)) return true;
        else return hasPathSum(root.right, targetSum);

    }

}
