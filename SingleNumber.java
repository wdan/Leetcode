public class Solution {
    public int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int ans = 0;
        for (int i=0;i<A.length;i++)
            ans = ans ^ A[i];
        return ans;
    }
}