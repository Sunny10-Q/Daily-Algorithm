class Solution {
    // 定义全局变量
    int count=0;
    int n;
    int ret;
    public int findTargetSumWays(int[] nums, int target) {
        n=target;
        dfs(nums,0);
        return count;
    }

    public void dfs(int[]nums,int pos){
        if(pos==nums.length){
            if(ret==n){
                count++;
            }
            return;
        }
        //+
        ret+=nums[pos];
        dfs(nums,pos+1);
        ret-=nums[pos];
        //-
        ret-=nums[pos];
        dfs(nums,pos+1);
        ret+=nums[pos];
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leet——494.目标和（回溯）");
    }
}
