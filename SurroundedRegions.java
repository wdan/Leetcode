public class Solution {
    public void solve(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0;i<m;i++){
            if (board[i][0]=='O')
                floodfill(board, i, 0);
            if (board[i][n-1]=='O')
                floodfill(board, i, n-1);
        }
        for (int i = 0;i<n;i++){
            if (board[0][i]=='O')
                floodfill(board, 0, i);
            if (board[m-1][i]=='O')
                floodfill(board, m-1, i);
        }
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
            if (board[i][j] == 'O')
                board[i][j] = 'X';
            else if (board[i][j] == '-'){
                board[i][j] = 'O';
            }
    }
    public static void floodfill(char[][] board, int sx, int sy){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        if (board[sx][sy]!='O') return;
        LinkedList<Integer> queueX = new LinkedList<Integer>();
        LinkedList<Integer> queueY = new LinkedList<Integer>();
        queueX.add(sx);
        queueY.add(sy);
        board[sx][sy] = '-';
        while(queueX.size()>0){
            int x = queueX.poll();
            int y = queueY.poll();
            for (int i=0;i<4;i++){
                if (check(board, x + dx[i], y + dy[i])){
                    queueX.add(x + dx[i]);
                    queueY.add(y + dy[i]);
                    board[x + dx[i]][y + dy[i]] = '-';
                }
            }
        }
    }
    public static boolean check(char[][] board, int x, int y){
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length)
            return false;
        if (board[x][y]!='O')
            return false;
        return true;
    }
}