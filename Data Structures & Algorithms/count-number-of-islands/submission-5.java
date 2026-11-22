class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    util(grid, i, j, grid.length, grid[i].length);
                    res++;
                }
            }
        }
        return res;
    }

    public void util(char[][] grid, int i, int j, int r, int c){
        if(i<0 || j<0 || i==r || j==c || grid[i][j]!='1')   return;
        grid[i][j] = 'X';
        util(grid, i+1, j, r, c);
        util(grid, i, j+1, r, c);
        util(grid, i-1, j, r, c);
        util(grid, i, j-1, r, c);
    }
}
