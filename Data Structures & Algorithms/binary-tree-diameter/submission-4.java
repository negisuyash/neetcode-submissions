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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return dia;
    }

    public int dfs(TreeNode node){
        if(node == null)    return 0;

        int ld = dfs(node.left);
        int rd = dfs(node.right);

        dia = Math.max(dia, ld+rd);

        return 1 + Math.max(ld, rd);
    }
}
