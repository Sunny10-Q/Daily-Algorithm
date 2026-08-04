import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> list;
    char[] c;

    public List<String> letterCasePermutation(String s) {
        c = s.toCharArray();
        list = new ArrayList<>();
        dfs(0);
        return list;
    }

    public void dfs(int pos) {
        if (pos == c.length) {
            list.add(new String(c));
            return;
        }

        // 如果是数字，直接跳过
        if (Character.isDigit(c[pos])) {
            dfs(pos + 1);
            return;
        }

        // 情况1：转为大写
        c[pos] = Character.toUpperCase(c[pos]);
        dfs(pos + 1);

        // 情况2：转为小写
        c[pos] = Character.toLowerCase(c[pos]);
        dfs(pos + 1);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——784.字母大小写全排序（回溯）");
    }
}
