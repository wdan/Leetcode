public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (k == 1){
            for (int i=1;i<=n;i++){
                ArrayList<Integer> t = new ArrayList<Integer>();
                t.add(i);
                ans.add(t);
            }
            return ans;
        }
        for (int i=n;i>=k;i--)
            for (ArrayList<Integer> t : combine(i-1, k-1)){
                t.add(i);
                ans.add(t);
            }
        return ans;
    }
}