class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS = heights.length;
        int COLS = heights[0].length;
        boolean[][] pac = new boolean[ROWS][COLS];
        boolean[][] atl = new boolean[ROWS][COLS];

        for (int col = 0; col < COLS; col++) {
            dfs(heights, 0, col, pac, heights[0][col]);
            dfs(heights, ROWS - 1, col, atl, heights[ROWS - 1][col]);
        }

        for (int row = 0; row < ROWS; row++) {
            dfs(heights, row, 0, pac, heights[row][0]);
            dfs(heights, row, COLS - 1, atl, heights[row][COLS - 1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (pac[row][col] && atl[row][col]) {
                    res.add(Arrays.asList(row, col));
                }
            }
        }

        return res;
    }

    private void dfs(int[][] heights, int row, int col, boolean[][] visited, int prevHeight) {
        if (row < 0 || col < 0 || row == heights.length || col == heights[0].length ||
            visited[row][col] || heights[row][col] < prevHeight) return;

        visited[row][col] = true;

        dfs(heights, row, col - 1, visited, heights[row][col]);
        dfs(heights, row, col + 1, visited, heights[row][col]);
        dfs(heights, row - 1, col, visited, heights[row][col]);
        dfs(heights, row + 1, col, visited, heights[row][col]);
    }
}

