class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][]dp=new int[n+1][m+1];
        dp[0][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(obstacleGrid[i-1][j-1]==1){
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n][m];
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——63.不同路径二（动态规划）");
    }
}
