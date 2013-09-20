public class Solution {
    public static boolean flag;
    public static boolean[][] row, column, block;
    public void solveSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        row = new boolean[9][10];
        column = new boolean[9][10];
        block = new boolean[9][10];
        for (int i=0;i<9;i++)
            for (int j=1;j<=9;j++){
                row[i][j] = false;
                column[i][j] = false;
                block[i][j] = false;
            }
        for (int i=0;i<9;i++)
            for (int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    int num = board[i][j] - '0';
                    setUsed(i, j, num, true);
                }
            }
        flag = false;
        search(board, 0, 0);
    }
    public static void search(char[][] board, int x, int y){
        if (flag) return;
        if (x == 9){
            flag = true;
            return;
        }
        if (board[x][y]!='.'){
            if (y == 8)
                search(board, x+1, 0);
            else
                search(board, x, y+1);
            return;
        }
        for (int i=1;i<=9;i++){
            if ((!row[x][i]) && (!column[y][i]) && (!block[(x/3)*3+y/3][i])){
                setUsed(x, y, i, true);
                board[x][y] = (char)('0' + i);
                if (y == 8)
                    search(board, x+1, 0);
                else
                    search(board, x, y+1);
                if (flag) return;
                board[x][y] = '.';
                setUsed(x, y, i, false);
            }
        }
    }
    public static void setUsed(int x, int y, int num, boolean flag){
        row[x][num] = flag;
        column[y][num] = flag;
        block[(x/3)*3+y/3][num] = flag;
    }
}