public class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix[0].length;
        int[] H = new int[n];
        int[] L = new int[n];
        int[] R = new int [n];
        for (int i=0;i<n;i++){
            H[i] = 0;
            L[i] = 0;
            R[i] = n;
        }
        int ans = 0;
        for (int i=0;i<m;i++){
            int left = 0, right = n;
            for (int j=0;j<n;j++){
                if (matrix[i][j] == '0'){
                    H[j] = 0;
                    L[j] = 0;
                    R[j] = n;
                    left = j+1;
                }else{
                    H[j] = H[j] + 1;
                    L[j] = Math.max(L[j], left);
                }
            }
            for (int j=n-1;j>=0;j--){
                if (matrix[i][j] == '0'){
                    right = j;
                }else{
                    R[j] =  Math.min(R[j], right);
                    ans = Math.max(ans, H[j] * (R[j] - L[j]));
                }
            }
        }
        return ans;
    }
}