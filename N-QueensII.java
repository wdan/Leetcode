public class Solution {
    public static int sum;
    public static int max;
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        sum = 0;
        max = (1 << n) - 1;
        search(0, 0, 0);
        return sum;
    }
    public static void search(int row, int ld, int rd){
        if (row!=max){
            int pos = max & ~(row | ld | rd);
            while (pos!=0){
                int p =  pos & -pos;
                pos = pos - p;
                search(row + p, (ld + p) << 1, (rd + p) >> 1);
            }
        }else
            sum++;
    }
}