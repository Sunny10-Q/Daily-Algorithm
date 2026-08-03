import java.util.ArrayList;
import java.util.List;

class Solution {
    // 定义全局变量
    int left; //记录左括号的数量
    int right; //记录右括号的数量
    StringBuilder str; //记录每一组括号组合
    List<String> list;
    int m;
    public List<String> generateParenthesis(int n) {
        m=n;
        list=new ArrayList<>();
        str=new StringBuilder ();
        dfs();
        return list;
    }

    public void dfs(){
        //判断
        if(right==m){
            list.add(str.toString());
        }
        //判断左括号数量是否大于m
        if(left<m){
            str.append('(');
            left++;
            dfs();
            left--;
            str.deleteCharAt(str.length()-1);
        }
        if(right<left){
            str.append(')');
            right++;
            dfs();
            right--;
            str.deleteCharAt(str.length()-1);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——22.括号生成（回溯）");
    }
}
