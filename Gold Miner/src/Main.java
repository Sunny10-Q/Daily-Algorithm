class Solution {
    //定义全局变量
    int max;
    int n;
    int m;
    boolean check[][];
    int []dx={-1,1,0,0};
    int []dy={0,0,-1,1};
    public int getMaximumGold(int[][] grid) {
        max=0;
        n=grid.length;
        m=grid[0].length;
        check=new boolean[n][m];
        //从每个位置开始走
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //判断当前位置是否可以进入
                if(grid[i][j]!=0){
                    check[i][j]=true;
                    max=Math.max(max,dfs(grid,i,j));
                    check[i][j]=false;
                }
            }
        }
        return max;
    }
    public int dfs(int[][]grid,int i,int j){
        int ret=grid[i][j];
        int num=0;
        //判断上下左右是否可走
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            //判断
            if (x>=0 && x<n &&y>=0 && y<m && !check[x][y] && grid[x][y]!=0){
                //此时可以进入
                check[x][y]=true;
                num=Math.max(dfs(grid,x,y),num);
                check[x][y]=false;
            }
        }
        return ret+num;
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——1219.黄金矿工（回溯）");
    }
}
