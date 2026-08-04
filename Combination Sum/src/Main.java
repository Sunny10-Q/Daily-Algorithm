import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> list;
    List<Integer> ret;
    int n;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list = new ArrayList<>();
        ret = new ArrayList<>();
        n = target;
        dfs(candidates, 0, 0);
        return list;
    }

    public void dfs(int[] candidates, int count, int start) {
        if (count > n) return;
        if (count == n) {
            list.add(new ArrayList<>(ret));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            ret.add(candidates[i]);
            dfs(candidates, count + candidates[i], i);
            ret.remove(ret.size() - 1);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——39.组合求和（回溯、剪枝）");
    }
}
