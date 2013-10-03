public class Solution {
    public int candy(int[] ratings) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int len = ratings.length;
        int[] res = new int[len];
        int sum = len, now = 1;
        for (int i=0;i<len;i++) res[i] = 0;
        for (int i=1;i<len;i++)
            if (ratings[i] > ratings[i-1])
                res[i] = Math.max(res[i], now++);
            else
                now = 1;
        now = 1;
        for (int i=len-2;i>=0;i--)
            if (ratings[i] > ratings[i+1])
                res[i] = Math.max(res[i], now++);
            else
                now = 1;
        for (int i=0;i<len;i++)
            sum += res[i];
        return sum;
    }
}