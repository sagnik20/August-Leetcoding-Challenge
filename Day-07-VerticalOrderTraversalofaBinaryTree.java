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
     List<List<Integer>> result = new ArrayList();
    int leftmostX = 0;
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        result.add(new ArrayList<Integer>());
        traverse(root, 0, 0);
        for (List<Integer> list : result)       // Remove extra data from lists 
            for (int i = 0; i < list.size(); i++)
                list.set(i, list.get(i) % 10000);
        return result;
    }
    
    
    private void traverse(TreeNode node, int x, int y) {
        if (node == null)  return;
        int nodeVal = node.val + (y * -10000);

        // Get the x list to add this node into.  If no list exists yet, 
        // then create it.
        List<Integer> list;
        if (x < leftmostX) {
            list = new ArrayList();
            result.add(0, list);
            leftmostX--;
        } else if (x - leftmostX >= result.size()) {
            list = new ArrayList();
            result.add(list);
        } else {
            list = result.get(x - leftmostX);
        }
        
        // Insert this node into the x list, in value order by doing an 
        // insertion sort (insert each item in correct order).
        if (list.isEmpty() || nodeVal >= list.get(list.size()-1)) {
            list.add(nodeVal);
        } else {
            int i = 0;
            while (i < list.size() && nodeVal > list.get(i))  i++;
            list.add(i, nodeVal);
        }
        
        // Descend into any child nodes.
        traverse(node.left,  x-1, y-1);
        traverse(node.right, x+1, y-1);
    }
}
