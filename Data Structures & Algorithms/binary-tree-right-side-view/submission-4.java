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
        traverse(root, 1, res);
        return res;
    }

    private void traverse(TreeNode node, int h, List<Integer> res){
        if(node==null)  return;
        if(res.size() < h) res.add(node.val);
        traverse(node.right, h+1, res);
        traverse(node.left, h+1, res);
    }
}
