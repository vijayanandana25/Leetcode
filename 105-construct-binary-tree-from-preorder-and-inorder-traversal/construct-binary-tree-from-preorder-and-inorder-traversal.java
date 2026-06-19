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
    int preInd = 0;
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int ind=0;ind<inorder.length;ind++){
            map.put(inorder[ind],ind);
        }
        return Constructbinary(preorder,0,inorder.length-1);
    }

    public TreeNode Constructbinary(int[] preorder, int start, int end){
        if(start>end) return null;
        int rootval = preorder[preInd++];
        TreeNode root = new TreeNode(rootval);
        int index = map.get(rootval);
        root.left = Constructbinary(preorder,start,index-1);
        root.right = Constructbinary(preorder,index+1,end);
        return root;
    }
}