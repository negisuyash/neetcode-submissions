
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        
        // Directions array for moving up, down, left, and right
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        // Min-Heap sorted by the maximum effort (best) so far
        // Element structure: {effort, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        // Push the starting cell (0 effort, row 0, col 0)
        pq.offer(new int[]{0, 0, 0});
        
        // Use a 2D boolean array for fast O(1) visited checks
        boolean[][] visited = new boolean[m][n];
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int best = curr[0];
            int r = curr[1];
            int c = curr[2];
            
            // If we reached the bottom-right corner, return the minimum effort
            if (r == m - 1 && c == n - 1) {
                return best;
            }
            
            // Skip processing if we have already visited this cell
            if (visited[r][c]) {
                continue;
            }
            visited[r][c] = true;
            
            // Explore adjacent neighbors
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                
                // Check grid boundaries
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                    // Effort to move to neighbor is the absolute difference in height
                    int diff = Math.abs(heights[r][c] - heights[nr][nc]);
                    
                    // The path effort is the maximum step difference along this path
                    int nextEffort = Math.max(diff, best);
                    
                    pq.offer(new int[]{nextEffort, nr, nc});
                }
            }
        }
        
        return 0;
    }
}