class Solution {
    boolean[][]check;
    int n,m;
    int []dx={0,0,1,-1};
    int []dy={1,-1,0,0};
    public int numIslands(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int count=0;
        check=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //判断当前位置是否可以进入dfs
                if(grid[i][j]=='1' && !check[i][j]){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][]grid,int i,int j){
        //将当前位置标记为走过
        check[i][j]=true;
        //向四周走
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 &&x<n && y>=0&&y<m &&!check[x][y]&& grid[x][y]!='0'){
                dfs(grid,x,y);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(
                "leetcode——200.岛屿数量（floodFill算法）"
        );
    }
}
