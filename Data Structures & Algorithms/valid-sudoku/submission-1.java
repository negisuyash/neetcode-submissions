class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    if(!set.add(c+" at row "+i) || !set.add(c+" at col "+j) || !set.add(c+" at 3x3 box "+i/3+" and "+j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
