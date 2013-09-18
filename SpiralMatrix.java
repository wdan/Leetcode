public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (matrix.length == 0) return ans;
        int stX = 0, edX = matrix[0].length-1;
        int stY = 0, edY = matrix.length-1;
        while(true){
            for (int i=stX;i<=edX;i++)
                ans.add(matrix[stY][i]);
            if (++stY>edY) break;
            for (int i=stY;i<=edY;i++)
                ans.add(matrix[i][edX]);
            if (--edX<stX) break;
            for (int i=edX;i>=stX;i--)
                ans.add(matrix[edY][i]);
            if (--edY<stY) break;
            for (int i=edY;i>=stY;i--)
                ans.add(matrix[i][stX]);
            if (++stX>edX) break;
        }
        return ans;
    }
}