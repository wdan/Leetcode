public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = A.length;
        if (len < 3) return 0;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 0;
        right[len-1] = 0;
        for (int i=1;i<len;i++){
            if (A[i-1] > left[i-1])
                left[i] =  A[i-1];
            else
                left[i] = left[i-1];
        }
        for (int i=len-2;i>=0;i--){
            if (A[i+1] > right[i+1])
                right[i] = A[i+1];
            else
                right[i] = right[i+1];
        }
        int ans = 0;
        for (int i=1;i<len-1;i++)
            if (Math.min(left[i], right[i]) - A[i] > 0){
                ans += Math.min(left[i], right[i]) - A[i];
            }
        return ans;
    }
}