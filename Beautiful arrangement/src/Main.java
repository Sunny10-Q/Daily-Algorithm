class Solution {
    int ret;
    int n;
    boolean []check;
    public int countArrangement(int _n) {
        n=_n;
        check=new boolean[n+1];
        dfs(1);
        return ret;
    }
    public void dfs(int i){
        if(i==n+1)
        {
            ret++;
            return;
        }
        for(int k=1;k<=n;k++)
        {
            if(check[k]==false)
            {
                if(k%i==0 ||i %k==0)
                {
                    check[k]=true;
                    dfs(i+1);
                    check[k]=false;
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——526.优美的排列（回溯）");
    }
}
