public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] ans = new int[2];
        ans[0] = searchLeft(A, target);
        ans[1] = searchRight(A, target);
        return ans;
    }
    public static int searchLeft(int[] A, int key){
         int st = 0, ed = A.length - 1;
         while (st <= ed){
             int mid = st + (ed - st) / 2;
             if (A[mid]>=key){
                 ed = mid - 1;
             }else{
                 st = mid + 1;
             }
         }
         if (st < A.length && A[st] == key) return st;
         else return -1;
    }
    public static int searchRight(int[]A, int key){
        int st = 0, ed = A.length - 1;
        while (st <= ed){
            int mid = st + (ed - st) / 2;
            if (A[mid]>key){
                ed = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        if (ed >=0 && A[ed] == key) return ed;
        else return -1;
    }
}