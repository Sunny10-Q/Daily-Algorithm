import java.util.ArrayList;
import java.util.List;

class Solution {
    // 定义全局变量
    List<List<Integer>> list;
    List<Integer> ret;
    int m;
    int v;
    public List<List<Integer>> combine(int n, int k) {
        m=n;
        v=k;
        list=new ArrayList<>();
        ret=new ArrayList<>();
        dfs(1,0);
        return list;
    }

    public void dfs(int n,int pos){
        // 剪枝：如果剩余数字不够，直接返回
        if (pos + (m - n + 1) < v) return;
        // 判断出口
        if(pos==v){
            list.add(new ArrayList<>(ret));
            return;
        }

        if(n<=m){
            //选择当前元素
            ret.add(n);
            dfs(n+1,pos+1);
            ret.remove(ret.size()-1);
            //不选择当前元素
            dfs(n+1,pos);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——77.组合（回溯）");
    }
}
