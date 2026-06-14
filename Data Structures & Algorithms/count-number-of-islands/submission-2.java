class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    util(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    

    public void util(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length)  return;
        if(grid[i][j]!='1') return;
        grid[i][j] = 'X';
        util(grid, i+1, j);
        util(grid, i-1, j);
        util(grid, i, j+1);
        util(grid, i, j-1);
    }
}
