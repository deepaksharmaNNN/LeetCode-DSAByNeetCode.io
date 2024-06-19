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
    class Pair{
        TreeNode node;
        int value;
        Pair(TreeNode node, int value){
            this.node = node;
            this.value = value;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        int result = 0;
        q.offer(new Pair(root, 1));
        while(q.size() > 0){
            int size = q.size();
            int min = q.peek().value;
            int left = 0, right = 0;
            for(int i = 0; i < size; i++){
                int currVal = q.peek().value - min;
                TreeNode curr = q.peek().node;
                q.poll();
                if(i == 0) left = currVal;
                if(i == size - 1) right = currVal;
                if(curr.left != null) q.offer(new Pair(curr.left, currVal * 2 + 1));
                if(curr.right != null) q.offer(new Pair(curr.right, currVal * 2 + 2));
            }
            result = Math.max(result , right - left + 1);
        }
        return result;
    }
}