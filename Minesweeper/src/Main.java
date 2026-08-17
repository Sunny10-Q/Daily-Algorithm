class Solution {
    //定义映射数组
    int []dx={0,0,-1,1,1,1,-1,-1};
    int []dy={1,-1,0,0,1,-1,1,-1};
    int m,n;
    public char[][] updateBoard(char[][] board, int[] click) {
        m=board.length;
        n=board[0].length;
        //判断点击的是不是雷
        int x=click[0];
        int y=click[1];
        if(board[x][y]=='M')
        {
            board[x][y]='X';
            return board;
        }

        dfs(board,x,y);
        return board;
    }

    public void dfs(char [][]board ,int i,int j)
    {
        //先判断周围一圈有多少雷
        int count=0;
        for(int k=0;k<8;k++)
        {
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<m && y>=0 && y<n && board[x][y]=='M')
            {
                count++;
            }
        }
        //分类讨论
        if(count==0)
        {
            board[i][j]='B';
            for(int k=0;k<8;k++)
            {
                int x=i+dx[k];
                int y=j+dy[k];
                if(x>=0 && x<m && y>=0 && y<n && board[x][y]=='E')
                {
                    board[i][j]='B';
                    dfs(board,x,y);
                }
            }
        }else{
            board[i][j]=(char)(count+'0');
            return;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——529.扫雷游戏");
    }
}
