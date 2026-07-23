import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        dfs(A, B, C, n);
    }

    public void dfs(List<Integer> A, List<Integer> B, List<Integer> C,int n) {
        if(n==1) {
            C.add(A.remove(A.size()-1));
            return;
        }
        //将A盘借助B盘移动到C盘
        dfs(A, C, B, n-1);
        //A移动到C
        C.add(A.remove(A.size()-1));
        //将B盘上的借助A盘移动到C盘
        dfs(B,A ,C, n-1);
    }
}

public class main {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1));
        List<Integer>B= new ArrayList<>();
        List<Integer>C= new ArrayList<>();
        Solution solution = new Solution();
        solution.hanota(A,B,C);
        System.out.println(C);
    }
}
