public class Solution {
    public int minCut(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        int[] dp = new int[len + 1];
        boolean[][] pal = new boolean[len][len];
        for (int i=0; i<=len;i++){
            dp[i] = len - i;
        }
        for (int i=0;i<len;i++)
            for (int j=0;j<len;j++)
                pal[i][j] = false;
        for (int i=len-1;i>=0;i--)
            for (int j = i; j<len;j++){
                if (s.charAt(i) == s.charAt(j)){
                    if (j - i < 2 || pal[i+1][j-1]){
                        pal[i][j] = true;
                        dp[i] = Math.min(dp[i], dp[j+1] + 1);
                    }
                }
            }
        return dp[0] - 1;
    }
}