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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        traverse(root, map, 0);
        return new ArrayList<>(map.values());
    }

    public void traverse(TreeNode node, Map<Integer, List<Integer>> map, int level){
        if(node == null)    return;
        List<Integer> list = map.getOrDefault(level, new ArrayList<>());
        list.add(node.val);
        map.put(level, list);
        traverse(node.left, map, level+1);
        traverse(node.right, map, level+1);
    }
}
