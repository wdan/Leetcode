public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] ans = new int[rowIndex + 1];
        for (int i = 0;i<=rowIndex;i++){
            for (int j = i;j>=0;j--){
                if (j == 0 || j == i)
                    ans[j] = 1;
                else{
                    ans[j] = ans[j] + ans[j-1];
                }
            }
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int e:ans){
            ar.add(e);
        }
        return ar;
    }
}