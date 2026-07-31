import java.util.ArrayList;
import java.util.List;

class Solution {
    //定义全局list
    List<List<Integer>> list=new ArrayList<>();
    int n;
    boolean[] check;
    public List<List<Integer>> permute(int[] nums) {
        //从数组中的每一个元素开始
        n=nums.length;
        check=new boolean[n];
        for(int index=0;index<n;index++){
            List<Integer> ret=new ArrayList<>();
            check[index]=true;
            ret.add(nums[index]);
            dfs(ret,nums);
            check[index]=false;
        }
        return list;
    }

    public void dfs(List<Integer>ret,int[] nums){
        if(ret.size()==n){
            //添加到最终结果list中
            list.add(new ArrayList<>(ret));
            return;
        }
        //进行循环判断下一个进入的数
        for(int index=0;index<n;index++){
            //判断当前数有咩有添加过
            if(check[index]==false){
                check[index]=true;
                ret.add(nums[index]);
                dfs(ret,nums);
                ret.remove(ret.size()-1);
                check[index]=false;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——083.全排列（回溯）");
    }
}
