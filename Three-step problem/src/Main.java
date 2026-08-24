class Solution {
    public int waysToStep(int n) {
        if(n==1||n==2)return n;
        if(n==3)return 4;
        int mod=(int)1e9+7;
        int[]dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=n;i++){
            dp[i]=((dp[i-1]+dp[i-2])%mod+dp[i-3])%mod;
        }
        return dp[n];
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——08.01.三步问题（动态规划）");
    }
}
