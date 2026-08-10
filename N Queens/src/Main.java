import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    //定义全局变量
    boolean []check;  //检查列是否能够放置皇后
    boolean []djx;    //检查对角线是否能够放置皇后
    boolean []fdjx;   //检查反对角线是否能够放置皇后
    List<List<String>> list; //最终返回结果
    char [][]path;//用来存放一种可能性的数据
    int n;
    public List<List<String>> solveNQueens(int m) {
        n=m;
        check=new boolean[n];
        djx=new boolean[2*n];
        fdjx=new boolean[2*n];
        list=new ArrayList<>();
        path=new char[n][n];

        //初始化
        for(int i=0;i<n;i++){
            Arrays.fill(path[i],'.');
        }
        dfs(0);
        return list;
    }

    public void dfs(int pos){
        //判断出口
        if(pos==n){
            //将结果加入到list中
            List<String>tmp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                tmp.add(new String(path[i]));
            }
            list.add(new ArrayList<>(tmp));
        }
        //判断pos层放置皇后
        for(int i=0;i<n;i++){
            //判断pos层的i位置能不能放置皇后
            if(check[i]==false && djx[pos-i+n]==false && fdjx[pos+i]==false){
                path[pos][i]='Q';
                check[i]=djx[pos-i+n]=fdjx[pos+i]=true;
                dfs(pos+1);
                check[i]=djx[pos-i+n]=fdjx[pos+i]=false;
                path[pos][i]='.';
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(
                "leetcode——51.N皇后（回溯递归）"
        );
    }
}
