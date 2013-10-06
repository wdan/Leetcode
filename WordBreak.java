public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (dict == null || dict.isEmpty()) return false;
        int len = s.length();
        boolean[][] dp = new boolean[len][len+1];
        for (int i=1;i<=len;i++)
            for (int j=0;j<len-i+1;j++){
                dp[j][i] = false;
                if (dict.contains(s.substring(j, j+i)))
                    dp[j][i] = true;
                else{
                    for (int k=j;k<j+i-1;k++){
                        if (dp[j][k-j+1] && dp[k+1][j+i-1-k]){
                            dp[j][i] = true;
                            break;
                        }
                    }
                }
            }
        return dp[0][len];
    }
}