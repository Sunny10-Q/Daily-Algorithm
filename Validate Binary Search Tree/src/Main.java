class Solution {
    long count=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        //算法思路：中序遍历的结果其实就是一个有序数组，如果当前结点的值小于前面结点的值，那么就是说明不是一个二叉搜索树

        //递归出口
        if(root==null)return true;//因为默认空树也是一颗搜索树

        //中序遍历
        //遍历左子树
        boolean left=isValidBST(root.left);
        //判断左子树满不满足条件
        if(left==false)
        {
            return false;
        }
        boolean cur=false;
        //如果条件成立，当前结点满足条件
        if(count<root.val)
        {
            count=root.val;
            cur=true;
        }
        //判断右子树满不满足条件
        boolean right=isValidBST(root.right);

        return left&&cur&&right;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——98.验证二叉搜索树");
    }
}
