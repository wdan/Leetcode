public class Solution {
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        int dp[] = new int[len+1];
        dp[0] = 1;
        for (int i=1;i<=len;i++){
            if (s.charAt(i-1) == '0'){
                if (i == 1 || s.charAt(i-2) > '2' || s.charAt(i-2) == '0') return 0;
                dp[i] = dp[i-2];
            }else{
                dp[i] = dp[i-1];
                if (i > 1 && (s.charAt(i-2) == '1' || (s.charAt(i-2) == '2' && s.charAt(i-1) <= '6')))
                dp[i] += dp[i-2];
            }
        }
        return dp[len];
    }
}