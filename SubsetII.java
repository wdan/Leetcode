public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] S = num;
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Stack<Integer> temp = new Stack<Integer>();
        search(S, 0, temp, ans);
        return ans;
    }
    public static void search(int[] S, int now, Stack<Integer> temp, ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<Integer>(temp));
        for (int i=now;i<S.length;i++){
            if (i!=now && S[i] == S[i-1]) continue;
            temp.push(S[i]);
            search(S, i+1, temp, ans);
            temp.pop();
        }
    }
}