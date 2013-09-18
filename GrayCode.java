public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i=0;i<Math.pow(2,n);i++){
            ans.add((i)^((i)>>1));
        }
        return ans;
    }
}