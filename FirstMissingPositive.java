public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = A.length;
        for (int i=0;i<A.length;i++){
            if (A[i]>0 && A[i] < n){
                if (A[i] - 1!=i && A[A[i]-1]!=A[i]){
                    int temp = A[A[i]-1];
                    A[A[i]-1] = A[i];
                    A[i] = temp;
                    i--;
                }
            }
        }
        for (int i=0;i<n;i++)
            if (i!=A[i]-1)
                return i+1;
        return n+1;
    }
}