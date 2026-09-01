// Last updated: 1/9/2026, 12:42:53 pm
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
        List<Integer> log=new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
        log.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        }
        return log;
        
    }
}