class Solution {
    public boolean isBalanced(TreeNode root) {
        // If checkHeight returns -1, the tree is unbalanced
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        // 1. Check if left subtree is balanced
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // Propagate the imbalance upward

        // 2. Check if right subtree is balanced
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // Propagate the imbalance upward

        // 3. Check if the current node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Found an imbalance at this node
        }

        // 4. Return the actual height if balanced
        return Math.max(leftHeight, rightHeight) + 1;
    }
}