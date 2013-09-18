public class Solution {
    public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int st = 0, ed = n - 1;
        int[][] map = new int[n][n];
        int num = 1;
        while(st<ed){
            for (int i=st;i<ed;i++){
                map[st][i] = num;
                num++;
            }
            for (int i=st;i<ed;i++){
                map[i][ed] = num;
                num++;
            }
            for (int i=ed;i>st;i--){
                map[ed][i] = num;
                num++;
            }
            for (int i=ed;i>st;i--){
                map[i][st] = num;
                num++;
            }
            st++;
            ed--;
        }
        if (st == ed) map[st][ed] = num;
        return map;
    }
}