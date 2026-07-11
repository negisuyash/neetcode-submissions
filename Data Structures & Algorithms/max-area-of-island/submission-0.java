class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    res = Math.max(res, dfs(grid, i, j, grid.length, grid[i].length));
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j, int len, int wid){
        if(i<0 || j<0 || i>= len || j>=wid || grid[i][j] == 0 || grid[i][j] == -1) return 0;
        grid[i][j] = -1;
        int area = 0;
        area += dfs(grid, i+1, j, len, wid);
        area += dfs(grid, i-1, j, len, wid);
        area += dfs(grid, i, j+1, len, wid);
        area += dfs(grid, i, j-1, len, wid);
        return area+1;
    }
}
