public class Solution {
    public boolean canCompleteCircuit(int[] gas, int[] cost) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int sum1 = 0;
        for (int i=0;i<gas.length;i++)
            sum1+=gas[i];
        int sum2 = 0;
        for (int j=0;j<cost.length;j++)
            sum2+=cost[j];
        return (sum1 - sum2) >= 0;
    }
}