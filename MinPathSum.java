public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        for (int i=0;i<n;i++) dp[i] = Integer.MAX_VALUE / 2;
        dp[0] = 0;
        for (int i = 0;i<m;i++)
            for (int j=0;j<n;j++){
                if (j!=0)
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j-1]);
                else 
                    dp[j] = grid[i][j] + dp[j];
            }
        return dp[n-1];
    }
}