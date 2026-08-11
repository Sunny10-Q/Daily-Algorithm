class Solution {
    int n, m;
    char[] word;
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        this.word = word.toCharArray();
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, int pos) {
        // 越界、已访问、字符不匹配
        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || board[i][j] != word[pos]) {
            return false;
        }
        // 所有字符匹配完毕
        if (pos == word.length - 1) {
            return true;
        }

        visited[i][j] = true;
        // 四个方向
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int d = 0; d < 4; d++) {
            int ni = i + dx[d];
            int nj = j + dy[d];
            if (dfs(board, ni, nj, pos + 1)) {
                return true;
            }
        }
        // 回溯
        visited[i][j] = false;
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——79.单词搜索（回溯）");
    }
}
