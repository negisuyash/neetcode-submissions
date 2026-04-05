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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        traverse(root, res, 0);

        return res;
    }

    public void traverse(TreeNode node, List<Integer> res, int level){
        if(node == null)    return;
        if(res.size()<=level){
            res.add(node.val);
        }
        traverse(node.right, res, level+1);
        traverse(node.left, res, level+1);
    }
}
