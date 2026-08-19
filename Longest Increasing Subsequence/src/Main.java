class Solution {
    // 记忆化搜索
    int n;
    public int lengthOfLIS(int[] nums) {

        n=nums.length;
        int max=0;
        int[]memo=new int[n+1];
        for(int i=0;i<n;i++){
            max=Math.max(dfs(i,nums,memo),max);
        }
        return max;
    }

    public int dfs(int pos,int []nums,int[]memo){
        if(memo[pos]!=0)return memo[pos];

        int ret=1;
        for(int i=pos+1;i<n;i++){
            if(nums[pos]<nums[i]){
                ret=Math.max(dfs(i,nums,memo)+1,ret);
            }
        }
        memo[pos]=ret;
        return ret;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——300.最长增长子序列（记忆化搜索）");
    }
}
