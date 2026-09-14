class Solution {
    public int count = 0;
    public boolean isSafe(int[][] board, int row, int col){
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 1) return false;
        }

        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
            if(board[i][j] == 1) return false;
        }

        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++){
            if(board[i][j] == 1) return false;
        }

        return true;
    }
    public void nQueens(int[][] board,int row){
        //base case
        if(row == board.length){
            count++;
            return;
        }
        //recursion case
        for(int j = 0; j < board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 1;
                nQueens(board,row+1);
                board[row][j] = 0;
            }
            
        }
    }
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n;j++){
                board[i][j] = 0;
            }
        }
        nQueens(board,0);
        return count;
    }
}