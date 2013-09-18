public class Solution {
    public boolean search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int st = 0, ed = A.length - 1;
        while (st<=ed){
            int mid = st + (ed - st) / 2;
            if (A[mid] == target){
                return true;
            }else if (A[st] < A[mid]){
                if (A[st] <= target && target < A[mid])
                    ed = mid - 1;
                else
                    st = mid + 1;
            }else if (A[st] > A[mid]){
                if (A[mid] < target && target <= A[ed])
                    st = mid + 1;
                else
                    ed = mid - 1;
            }else
                st++;
        }
        return false;
    }
}