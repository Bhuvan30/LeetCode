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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> ioim=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            ioim.put(inorder[i],i);
        }
        return splitTree(preorder,ioim,0,0,inorder.length-1);
    }
    public TreeNode splitTree(int[] preorder,Map<Integer,Integer> ioim,int ri,int l,int r){
        TreeNode root=new TreeNode(preorder[ri]);
        int mid=ioim.get(preorder[ri]);
        if(mid>l){
            root.left=splitTree(preorder,ioim,ri+1,l,mid-1);
        }
        if(mid<r){
            root.right=splitTree(preorder,ioim,ri+mid-l+1,mid+1,r);
        }
        return root;
    }
}