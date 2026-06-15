class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    visit(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void visit(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)   return;
        if(grid[i][j] != '1')   return;
        grid[i][j] = 'X';
        visit(grid, i+1, j);
        visit(grid, i-1, j);
        visit(grid, i, j+1);
        visit(grid, i, j-1);
    }
}
