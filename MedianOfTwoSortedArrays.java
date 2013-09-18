public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int lenA = A.length;
        int lenB = B.length;
        int count = 0;
        int i = 0; int j = 0;
        int mid = 0, pre = 0;
        while (count < (lenA + lenB) / 2 + 1){
            if (i==lenA){
                count++;
                pre = mid;
                mid = B[j];
                j++;
            }else if (j==lenB){
                count++;
                pre = mid;
                mid = A[i];
                i++;
            }else if (A[i] < B[j]){
                count++;
                pre = mid;
                mid=A[i];
                i++;
            }else{
                count++;
                pre = mid;
                mid=B[j];
                j++;
            }
        }
        if ((lenA+lenB)%2==0){
            return (0.0+pre+mid)/2;
        }
        else
            return mid;
    }
}