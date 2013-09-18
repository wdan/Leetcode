public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = obstacleGrid.length;
        if (m == 0) return 0;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                dp[i][j] = 0;
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (i==0 && j==0) continue;
                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                if (i-1 >=0) dp[i][j]+=dp[i-1][j];
                if (j-1 >=0) dp[i][j]+=dp[i][j-1];
            }
        return dp[m-1][n-1];
    }
}