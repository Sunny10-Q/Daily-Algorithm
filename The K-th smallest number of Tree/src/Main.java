
class Solution {
    //定义全局变量
    int count=0;
    int x;
    int y=0;
    int cur=Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        x=k;
        dfs(root);
        return count;
    }
    public void dfs(TreeNode root){
        //判断当前节点为不为空
        if(root==null) return ;
        //中序遍历
        dfs(root.left);
        //判断当前节点是否大于cur
        if(root.val>cur){
            cur=root.val;
            y++;
            if(y==x)count=root.val;
        }
        dfs(root.right);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——230.二叉搜索树中第K小的元素（深搜）");

    }
}
