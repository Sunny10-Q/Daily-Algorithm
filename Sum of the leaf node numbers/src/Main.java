class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int val){
        //更新val的值
        val=val*10+root.val;
        //判断当前节点是不是叶子节点
        if(root.left==null && root.right==null){
            return val;
        }
        //判断左子树是否为空
        int sum=0;
        if(root.left!=null) sum+=dfs(root.left,val);
        if(root.right!=null) sum+=dfs(root.right,val);
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——049-求根节点到叶子节点数字之和（DFS）");
    }
}
