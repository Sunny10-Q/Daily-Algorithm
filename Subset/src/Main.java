import java.util.ArrayList;
import java.util.List;

class Solution {
    // 创建全局变量
    List<Integer> path;
    List<List<Integer>>ret;
    public List<List<Integer>> subsets(int[] nums) {
        path=new ArrayList<>();
        ret=new ArrayList<>();

        dfs(nums,0);
        return ret;
    }

    public void dfs(int[]nums,int pos){
        //判断当前位置
        if(pos==nums.length){
            ret.add(new ArrayList<>(path));
            return;
        }

        //选择当前位置的元素
        path.add(nums[pos]);
        dfs(nums,pos+1);
        path.remove(path.size()-1);

        //不选择当前位置元素
        dfs(nums,pos+1);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——079.子集（深搜、回溯）");
    }
}
