
class Solution {
    public boolean evaluateTree(TreeNode root) {
        //判断当前节点是不是叶子节点
        if(root.val==1 ){
            //此时是叶子节点直接返回
            return true;
        }
        if(root.val==0){
            return false;
        }
        //此时不是叶子节点，先处理左边节点，再处理右边节点
        boolean leftNode=evaluateTree(root.left);
        boolean rightNode=evaluateTree(root.right);
        if(root.val==2){
            //判断left和right运算后的值
            if(leftNode!=true && rightNode!=true){
                return false;
            }else{
                return true;
            }
        }else{
            if(leftNode==true && rightNode==true){
                return true;
            }else{
                return false;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——2331.计算布尔二叉树的值");
    }
}
