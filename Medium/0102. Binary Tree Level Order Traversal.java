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
import java.util.Queue;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> inner = new ArrayList<>();
            for (int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                if (node != null){
                    if (node.left != null){
                        queue.add(node.left);
                    }
                    if (node.right != null){
                        queue.add(node.right);
                    }
                    inner.add(node.val);
                }
            }
            if (!inner.isEmpty())
                outer.add(inner);
        }
        return outer;
    }
}
