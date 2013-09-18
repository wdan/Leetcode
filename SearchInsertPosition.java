public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = A.length;
        int st = 0, ed = len - 1;
        while (st <= ed){
            int mid = (st + ed) / 2;
            if (A[mid] >= target){
                ed = mid - 1;
                continue;
            }else{
                st = mid + 1;
                continue;
            }
        }
        return ed + 1;
    }
}