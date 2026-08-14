class Solution {
    int n,m;
    boolean check[][];
    int[]dx={0,0,1,-1};
    int[]dy={1,-1,0,0};
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int max=0;
        check=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !check[i][j]){
                    max=Math.max(dfs(grid,i,j),max);
                }
            }
        }
        return max;
    }
    public int dfs(int[][]grid,int i,int j){
        //将当前位置设置为走过
        int count=1;
        check[i][j]=true;
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<n &&y>=0 &&y<m && !check[x][y] && grid[x][y]==1){
                count+=dfs(grid,x,y);
            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——岛屿的最大面积（floodfill算法）");
    }
}
