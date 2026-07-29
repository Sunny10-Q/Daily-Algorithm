class Solution {
    public TreeNode pruneTree(TreeNode root) {
        //判断当前节点是否为空
        if(root==null)return null;

        //判断左边子树和右边子树是否为空
        TreeNode left=pruneTree(root.left);
        TreeNode right=pruneTree(root.right);

        if(root.val==0 && left==null && right==null)return null;
        if(root.val==1 && right==null && left==null){
            root.left=null;
            root.right=null;
            return root;
        }
        //判断左子树情况
        if(left!=null && right==null){
            root.right=null;
            return root;
        }
        //判断右子树情况
        if(right!=null&& left==null){
            root.left=null;
            return root;
        }
        return root;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——814.二叉树剪枝");
    }
}
