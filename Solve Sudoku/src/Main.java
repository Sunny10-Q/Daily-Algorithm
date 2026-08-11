class Solution {
    public boolean isValidSudoku(char[][] board) {
        //9代表9列，10代表1-9这些数，[9][10]表示在1-9这几列中有没有出现1-9这些数字
        boolean col[][]=new boolean[9][10];
        //表示行
        boolean row[][]=new boolean[9][10];
        //表示在3*3的九宫格中有没有出现1-9之间的数字
        boolean ret[][][]=new boolean[3][3][10];

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                //判断是不是数字
                if(board[i][j]!='.')
                {
                    //判断是不是有效的数独
                    int num=board[i][j]-'0';
                    if(row[i][num]==true || col[j][num]==true ||ret[i/3][j/3][num]==true)
                        return false;
                    row[i][num]=true;
                    col[j][num]=true;
                    ret[i/3][j/3][num]=true;
                }
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——37.解数独（回溯）");
    }
}
