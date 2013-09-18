public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int x = m + n - 2;
        int y = Math.min(m, n) - 1;
        long ans = 1;
        long div = 1;
        for (int i = 1; i <= y; ++i) {
            ans *= x--;
            div *= i;
        }
        return (int)(ans/div);
    }
}