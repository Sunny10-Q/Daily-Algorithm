import java.util.ArrayList;
import java.util.List;

class Solution {
    //最终返回结果
    List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return list;
    }

    public void dfs(TreeNode root,String str){
        String s=str;
        //判断当前节点是否为空
        if(root==null) return ;

        //判断当前节点是否为叶子节点
        if(root.left==null && root.right==null){
            //此时添加路径
            str=str+String.valueOf(root.val);
            list.add(str);
        }

        //判断左子树是否为空
        if(root.left!=null){
            str=str+String.valueOf(root.val)+"->";
            dfs(root.left,str);
        }
        str=s;
        //判断右子树
        if(root.right!=null){
            str=str+String.valueOf(root.val)+"->";
            dfs(root.right,str);
        }

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——257.二叉树的所有路径（深搜）");
    }
}
