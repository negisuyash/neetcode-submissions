class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    if(!set.add(board[i][j]+ " at row "+i) || !set.add(board[i][j]+" at col "+j) || !set.add(board[i][j]+" at grid "+i/3+" and "+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
