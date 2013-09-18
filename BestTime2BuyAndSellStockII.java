public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int sum = 0;
        if (prices.length < 2) return 0;
        for (int i=1;i<prices.length;i++){
            if (prices[i] - prices[i-1] > 0)
            sum += (prices[i] - prices[i-1]);
        }
        return sum;
    }
}