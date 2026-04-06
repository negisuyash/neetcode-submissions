class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        return move(arr, 0, 0, m, n);
    }

    public int move(int[][] arr, int i, int j, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n)  return 0;
        if(i==m-1 && j==n-1)    return 1;
        if(arr[i][j]!=0)    return arr[i][j];
        arr[i][j] = move(arr, i+1, j, m, n) + move(arr, i, j+1, m, n);
        return arr[i][j];
    }
}
