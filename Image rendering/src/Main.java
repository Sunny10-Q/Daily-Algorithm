class Solution {
    int []dx={-1,1,0,0};
    int []dy={0,0,1,-1};
    int n,m;
    int num;
    int ret;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        n=image.length;
        m=image[0].length;
        num=image[sr][sc];
        ret=color;
        if(num==color){
            return image;
        }
        dfs(image,sr,sc);
        return image;
    }
    public void dfs(int[][]image,int i,int j){

        //将当前位置修改为目标值
        image[i][j]=ret;
        //判断四周是否可以走
        for(int k=0;k<4;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            //判断是否可走
            if(x>=0 && x<n && y>=0 && y<m && image[x][y]==num){
                dfs(image,x,y);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("leetcode——733.图像渲染（floodFill算法）");
    }
}
