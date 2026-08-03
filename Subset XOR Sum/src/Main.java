class Solution {
    // 定义全局变量
    int count;  //最终相加结果
    int ret;    //用来进行异或和运算
    public int subsetXORSum(int[] nums) {
        count=0;
        ret=0;
        dfs(nums,0);
        return count;
    }

    public void dfs(int[]nums,int pos){
        //判断当前是第几层
        if(pos==nums.length){
            count+=ret;
            return;
        }

        //选择当前节点
        int x=ret;
        ret^=nums[pos];
        dfs(nums,pos+1);;
        ret=x;
        //不选择当前节点
        dfs(nums,pos+1);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——1863.找出所有子集的异或总和再求和（回溯）");
    }
}
