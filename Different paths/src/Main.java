class Solution {
    public int uniquePaths(int m, int n) {
        int[][]ret=new int[m+1][n+1];
        return dfs(m,n,ret);
    }

    public int dfs(int i,int j,int[][]ret){
        if(ret[i][j]!=0)return ret[i][j];

        if(i==0 || j==0){
            return 0;
        }
        if(i==1 && j==1){
            ret[i][j]=1;
            return 1;
        }
        ret[i][j]=dfs(i-1,j,ret)+dfs(i,j-1,ret);
        return ret[i][j];
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(
                "leetcode——62.不同路径（记忆化搜索）"
        );
    }
}
