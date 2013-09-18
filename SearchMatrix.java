public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0, y = n - 1;
        while(x<m && y>=0){
            if (matrix[x][y] == target){
                return true;
            }else if (matrix[x][y] < target){
                x++;
            }else{
                y--;
            }
        }
        return false;
    }
}