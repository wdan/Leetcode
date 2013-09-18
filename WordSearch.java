public class WordSearch{
    public static void main(String[] args){
        char[][] board = {{'a','a'}};
        String word = "aa";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (board.length == 0 && word!=null && !word.isEmpty()) return false;
        if (word == null || word.isEmpty()) return true;
        int m = board.length;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                used[i][j] = false;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (board[i][j] == word.charAt(0))
                    if (search(board, used, i, j, word, 0)) return true;
            }
        return false;
    }
    public static boolean search(char[][] board, boolean[][] used, int sx, int sy, String word, int st){
        if (st >= word.length() - 1) return true;
        used[sx][sy] = true;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i=0;i<4;i++){
            int x = sx + dx[i];
            int y = sy + dy[i];
            if (check(board, used, x, y, word, st+1))
                if (search(board, used, x, y, word, st+1)) return true;
        }
        used[sx][sy] = false;
        return false;
    }
    public static boolean check(char[][] board, boolean[][] used, int sx, int sy, String word, int st){
        int m = board.length;
        int n = board[0].length;
        if (sx < 0 || sx >= m || sy < 0 || sy >= n) return false;
        if (board[sx][sy]!=word.charAt(st) || used[sx][sy]) return false;
        return true;
    }
}
