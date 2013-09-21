public class Solution {
    public static ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(candidates);
        ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        search(candidates, target, 0, 0, temp);
        return ans;
    }
    public static void search(int[] candidates, int target, int now, int index, ArrayList<Integer> temp){
        if (now > target) return;
        if (now == target){
            ans.add((ArrayList<Integer>)(temp.clone()));
            return;
        }
        if (index == candidates.length) return;
        int t = candidates[index];
        search(candidates, target, now, index+1, temp);
        while(now+t<=target){
            temp.add(candidates[index]);
            search(candidates, target, now+t, index+1, temp);
            t+=candidates[index];
        }
        for (int i=0;i<(t-candidates[index])/candidates[index];i++){
            temp.remove(temp.size()-1);
        }
    }
}