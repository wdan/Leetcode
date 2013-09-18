public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int st = 0, ed = A.length - 1;
        for (int i = 0;i<=ed;i++){
            if (A[i] == 0){
                swap(A, i, st);
                st++;
            }else if (A[i] == 2){
                swap(A, i, ed);
                ed--;
                i--;
            }
        }
    }
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}