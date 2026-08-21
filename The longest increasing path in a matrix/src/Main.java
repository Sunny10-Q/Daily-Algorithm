class Solution {
    //创建向量数组
    int []dx={0,0,1,-1};
    int []dy={1,-1,0,0};
    //创建标记数组
    int [][]mmemo;
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        mmemo=new int[m][n];
        int ret=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ret=Math.max(dfs(matrix,i,j),ret);
            }
        }
        return ret;
    }

    public int dfs(int [][]matrix,int i,int j){
        if(mmemo[i][j]!=0)return mmemo[i][j];
        int ret=0;
        for(int k=0;k<4;k++)
        {
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<m && y>=0 && y<n  && matrix[x][y]>matrix[i][j])
            {
                ret=Math.max(dfs(matrix,x,y),ret);
            }
        }
        mmemo[i][j]=ret+1;
        return ret+1;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("leetcode——LCR.112.矩阵中的最长递增路径（记忆化搜索）");
    }
}
