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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        // TreeNode trav1 = p;
        // TreeNode trav2 = q;
        // TreeNode trav3 = p;
        // TreeNode trav4 = q;
        // while(trav1!=null && trav2!=null){
        //     if(trav1.val != trav2.val || trav1.left != trav2.left || trav1.right != trav2.right ){
        //         return false;
        //     }
            
        //     trav1 = trav1.left;
        //     trav2 = trav2.left;
        // }
        // while(trav3!=null && trav4!=null){
        //     if(trav3.val != trav4.val || trav3.left != trav4.left || trav3.right != trav4.right){
        //         return false;
        //     }
        //     trav3 = trav3.right;
        //     trav4 = trav4.right;
        // }
        // return true;
    }
}