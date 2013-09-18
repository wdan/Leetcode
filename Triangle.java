public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = triangle.size();
        int[] dp = new int[len];
        for (int i=0;i<len;i++) dp[i] = 0;
        for (int i=0;i<len;i++)
          for (int j=i;j>=0;j--){
              int add;
              if ((j == i) && (j>0)){
                  add = dp[j-1];
              }
              else if ((j-1>=0)&&(dp[j-1]<dp[j])){
                  add = dp[j-1];
              }
              else{
                  add = dp[j];
              }
              dp[j]=add+triangle.get(i).get(j);
          }
        int min = Integer.MAX_VALUE;
        for (int i=0;i<len;i++)
          if (min>dp[i]) min = dp[i];
        return min;
    }
}