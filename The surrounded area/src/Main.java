class Solution {
    int[]dx={0,0,1,-1};
    int[]dy={1,-1,0,0};
    int n,m;
    public void solve(char[][] board) {
        n=board.length;
        m=board[0].length;
        //处理第一列和最后一列
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][m-1]=='O'){
                dfs(board,i,m-1);
            }
        }
        //处理第一行和最后一行
        for(int j=0;j<m;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j);
            }
            if(board[n-1][j]=='O'){
                dfs(board,n-1,j);
            }
        }
        //判断
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='.'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char[][]board,int i,int j){
        board[i][j]='.';
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<n &&y>=0 &&y<m && board[x][y]=='O'){
                dfs(board,x,y);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——130.被围绕的区域（floodfill算法）");
    }
}
