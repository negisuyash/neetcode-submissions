class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islandCount = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    visit(grid, i, j, n, m);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    public void visit(char[][] grid, int i, int j, int n, int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='X' || grid[i][j]=='0')    return;
        grid[i][j]='X';
        visit(grid, i+1, j, n, m);
        visit(grid, i-1, j, n, m);
        visit(grid, i, j+1, n, m);
        visit(grid, i, j-1, n, m);
    }
}
