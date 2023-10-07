class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int k = (i / 3) * 3 + j / 3;
                    if (row[i][num]++ > 0 || col[j][num]++ > 0 || box[k][num]++ > 0)
                        return false;
                }
            }
        }
        return true;
    }
}
