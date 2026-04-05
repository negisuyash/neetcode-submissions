class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        return move(arr, 0, 0);
    }

    public int move(int[][] arr, int i, int j){
        if(i<0 || i>= arr.length || j<0 || j>=arr[0].length)    return 0;
        if(i == arr.length-1 && j == arr[0].length-1)   return 1;
        return move(arr,i+1,j) + move(arr,i, j+1);
    }
}
