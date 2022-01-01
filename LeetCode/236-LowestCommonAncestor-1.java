//Ashwin Sub: my solution with booleans
//No extra space (only recursion stack space O(N))
//Time: O(N)
/*Logic:
2 of these 3 cases must be true to have an LCA
1. recursion on left children must give true (if node p or q exists)
2. recursion on right children must give true (if node p or q exists)
3. the current node itself might be node p or q
*/
class Solution {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans = null;
        dfs(root, p, q);
        return ans;
    }
    boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return false;
        boolean l = dfs( root.left,  p, q);
        boolean r = dfs( root.right,  p, q);
        boolean c = root.val == p.val || root.val == q.val;
        if(l&&r || l&&c || r&&c) ans = root;
        return l | r | c;
    }
}
