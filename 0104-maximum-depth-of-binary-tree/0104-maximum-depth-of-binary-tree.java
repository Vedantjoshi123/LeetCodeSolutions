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
    public int maxDepth(TreeNode root) {
        // DFS
        TreeNode trav = root;
        if(trav == null){
            return 0;
        }
        return 1+Math.max(maxDepth(trav.left), maxDepth(trav.right));

        // TreeNode trav = root;
        // int count = 1;
        // if(trav == null){
        //     return 0;
        // }
        // while(trav.right != null){
        //     count++;
        //     trav = trav.right;
        // }
        // while(trav.left != null){
        //     count++;
        //     trav = trav.left;
        // }
        // return count;

    }
}