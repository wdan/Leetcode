public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0;i<numRows;i++){
            ArrayList<Integer> t = new ArrayList<Integer>();
            for (int j = 0;j<=i;j++){
                if (j==0 || j ==i)
                    t.add(1);
                else{
                    t.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(t);
        }
        return ans;
    }
}