class Solution {
    boolean[][]check;
    int []dx={0,0,-1,1};
    int []dy={-1,1,0,0};
    int sum;
    int n,m;
    int ret;
    public int uniquePathsIII(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        sum=0;
        ret=0;
        check=new boolean[n][m];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //判断0的个数
                if(grid[i][j]==0)sum++;
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        sum+=2;
        check[x][y]=true;
        dfs(grid,x,y,1);
        return ret;
    }
    public void dfs(int[][]grid,int i,int j,int count){
        //判断
        if(grid[i][j]==2){
            if(count==sum){
                ret++;
            }
        }
        //判断上下左右路径
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<n && y>=0 && y<m &&check[x][y]==false && grid[x][y]!=-1)
            {
                check[x][y]=true;
                dfs(grid,x,y,count+1);
                check[x][y]=false;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——980.不同路径Ⅲ（回溯）");
    }
}
