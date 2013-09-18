public class Solution {
    public int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = Integer.MIN_VALUE;
        int now = 0;
        for (int i=0;i<A.length;i++){
            if (now + A[i] >= 0){
                if (max < now + A[i])
                    max = now + A[i];
                now = now + A[i];
            }else{
                if (max < A[i])
                    max = A[i];
                now = 0;
            }
        }
        return max;
    }
}