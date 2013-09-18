public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Stack<Integer> temp = new Stack<Integer>();
        search(S, 0, temp, ans);
        return ans;
    }
    public static void search(int[] S, int now, Stack<Integer> temp, ArrayList<ArrayList<Integer>> ans){
        if (now == S.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.push(S[now]);
        search(S, now+1, temp, ans);
        temp.pop();
        search(S, now+1, temp, ans);
    }
}