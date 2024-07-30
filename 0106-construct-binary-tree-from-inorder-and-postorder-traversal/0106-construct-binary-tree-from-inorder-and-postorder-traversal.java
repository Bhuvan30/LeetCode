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
    int[] inOrder,postOrder;
    Map<Integer,Integer> hm=new HashMap<>();
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrder = inorder;
        postOrder = postorder;
        int n = inorder.length;
        index = n-1;
        for(int i=0;i<n;i++){
            hm.put(inorder[i],i);
        }
        TreeNode root = dfs(0,n-1);
        return root;
    }
    private TreeNode dfs(int s,int e){
        if(s>e)return null;
        int curval=postOrder[index--];
        TreeNode cur=new TreeNode(curval);
        int mid=hm.get(curval);
        cur.right=dfs(mid+1,e);
        cur.left=dfs(s,mid-1);
        return cur;
    }
}