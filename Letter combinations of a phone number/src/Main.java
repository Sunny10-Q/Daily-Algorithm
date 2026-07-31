import java.util.ArrayList;
import java.util.List;

class Solution {
    //创建全局list
    List<String> list;
    String []hash={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    StringBuilder  path;
    public List<String> letterCombinations(String digits) {
        path=new StringBuilder();
        list=new ArrayList<>();
        //判断特殊情况
        if(digits.length()==0)return list;
        //0表示当前是digits中的第几个电话按键
        dfs(digits,0);
        return list;
    }

    public void dfs(String digits,int pos){
        if(digits.length()==pos){
            list.add(path.toString());
            return;
        }
        //获取当前案件的对应字符串
        String str=hash[digits.charAt(pos)-'0'];
        for(int i=0;i<str.length();i++){
            path.append(str.charAt(i));
            dfs(digits,pos+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——17.电话号码的字母组合（回溯）");
    }
}