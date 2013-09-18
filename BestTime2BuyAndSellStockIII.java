import java.util.*;
public class BestTime2BuyAndSellStockIII{
    public static void main(String[] args){
        int[] test = {1,2};
        System.out.println(maxProfit(test));
    }
    public static int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int ans = 0;
        int len = prices.length;
        if (len < 2) return 0;
        int min = prices[0];
        int max = prices[len-1];
        int[] his = new int[len];
        int[] future = new int[len];
        for (int i=0;i<len;i++){
            his[i] = 0;
            future[i] = 0;
        }
        for (int i=1;i<len;i++){
            min = Math.min(min, prices[i]);
            his[i] = Math.max(his[i-1], prices[i] - min);
        }
        for (int i=len-2;i>=0;i--){
            max = Math.max(max, prices[i]);
            future[i] = Math.max(future[i+1], max - prices[i]);
            ans = Math.max(ans, future[i] + his[i]);
        }
        return ans;
    }
}
