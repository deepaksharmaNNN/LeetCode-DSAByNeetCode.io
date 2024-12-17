/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean solve(TreeNode curr){
        if(curr.left == null && curr.right == null){
            return curr.val == 0 ? false : true;
        }
        boolean left = solve(curr.left);
        boolean right = solve(curr.right);
        return (curr != null && curr.val == 3) ? (left & right) : (left | right);
    }
    public boolean evaluateTree(TreeNode root) {
        return solve(root);
    }
}