public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A.length==0) return 0;
        int p = 0;
        boolean duplicate = false;
        for (int i=1;i<A.length;i++){
            if (A[i]!=A[i-1]){
                A[p] = A[i-1];
                p++;
                duplicate = false;
            }else{
                if (!duplicate){
                    A[p] = A[i-1];
                    p++;
                    duplicate = true;
                }
            }
        }
        A[p] = A[A.length-1];
        return p+1;
    }
}