class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    visit(grid, grid.length, grid[i].length, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void visit(char[][] grid, int m, int n, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n)  return;
        if(grid[i][j]=='X' || grid[i][j] == '0') return;
        grid[i][j] = 'X';
        visit(grid, m, n, i+1, j);
        visit(grid, m, n, i-1, j);
        visit(grid, m, n, i, j+1);
        visit(grid, m, n, i, j-1);
    }
}
