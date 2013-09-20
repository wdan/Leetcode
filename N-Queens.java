public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        char[][] map = new char[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                map[i][j] = '.';
        ArrayList<String[]> ans = new ArrayList<String[]>();
        search(map, 0, n, ans);
        return ans;
    }
    public static void search(char[][] map, int now, int tot, ArrayList<String[]> ans){
        if (now == tot){
            String[] t = new String[tot];
            for (int i=0;i<tot;i++)
                t[i] = new String(map[i]);
            ans.add(t);
            return;
        }
        for (int i=0;i<tot;i++){
            if (check(map, now, i, tot)){
                map[now][i] = 'Q';
                search(map, now+1, tot, ans);
                map[now][i] = '.';
            }
        }
    }
    public static boolean check(char[][] map, int x, int y, int tot){
        for (int i=0;i<tot;i++)
            if (map[i][y] == 'Q') return false;
        for (int i=-tot+1;i<tot;i++){
            if (i == 0) continue;
            if ((x+i) >= 0 && (x+i) < tot && (y+i) >= 0 && (y+i) < tot && map[x+i][y+i]=='Q')
                return false;
            if ((x+i) >= 0 && (x+i) < tot && (y-i) >= 0 && (y-i) < tot && map[x+i][y-i]=='Q')
                return false;
        }
        return true;
    }
}