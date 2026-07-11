class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes = 0, fresh = 0;
        Deque<int[]> dq = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1)   fresh++;
                if(grid[i][j]==2)   dq.add(new int[]{i,j});
            }
        }
        int[][] dirs = new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
        while(fresh>0 && !dq.isEmpty()){
            int len = dq.size();
            for(int i=0;i<len;i++){
                int[] cell = dq.pollFirst();
                for(int[] dir : dirs){
                        int newRow = cell[0] + dir[0];
                        int newCol = cell[1] + dir[1];
                        if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]==1){
                            grid[newRow][newCol] = 2;
                            dq.addLast(new int[]{newRow, newCol});
                            fresh--;
                        }
                }}
                minutes++;
            }
            return fresh > 0 ? -1 : minutes;
        }
}