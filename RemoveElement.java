public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = A.length;
        int p = 0;
        for (int i=0;i<n;i++){
            if (A[i]!=elem){
                A[p] = A[i];
                p++;
            }
        }
        return p;
    }
}