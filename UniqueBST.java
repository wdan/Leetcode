public class UniqueBST{
    public static int numTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i=2;i<=n;i++){
            dp[i] = 0;
            for (int j = 1;j<i - 1;j++){
                dp[i] +=dp[j] * dp[i - 1 - j];
            }
            dp[i] += (2 * dp[i-1]);
        }
        return dp[n];
    }
    public static void main(String[] args){
        System.out.println(numTrees(3));
    }
}
