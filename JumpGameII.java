public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int ret = 0;
        int last = 0;
        int curr = 0;
        for (int i = 0;i < A.length;i++) {
            if (i > last) {
                last = curr;
                ret++;
            }
            curr = Math.max(curr, i+A[i]);
        }

        return ret;
    }
}