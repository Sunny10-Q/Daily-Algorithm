class Solution {
    public int uniquePaths(int m, int n) {
        //动态规划
        int [][]dp=new int[m+1][n+1];
        //dp[i][j]就表示当前位置有多少种路径可以到达
        dp[1][1]=1;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 &&j==1)continue;
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];

    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(
                "leetcode——LCR 098.不同路径（动态规划）"
        );
    }
}
