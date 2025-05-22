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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }
    public boolean isSymmetric(TreeNode trav1 , TreeNode trav2){
        if(trav1==null && trav2==null) return true;
        
        if(trav1==null || trav2==null) return false;

        if(trav1.val != trav2.val) return false;

        return isSymmetric(trav1.left, trav2.right) && isSymmetric(trav1.right, trav2.left);
    }
}