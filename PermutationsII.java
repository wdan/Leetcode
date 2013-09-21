public class Solution {
    public static ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> his = new ArrayList<Integer>();
        boolean[] used = new boolean[num.length];
        for (boolean x:used) x = false;
        search(num, 0, his, used);
        return ans;
    }
    public static void search(int[] num, int now, ArrayList<Integer>his, boolean[] used){
        if (now == num.length){
            ans.add((ArrayList<Integer>)his.clone());
            return;
        }
        for (int i=0;i<num.length;i++){
            if (used[i] || (i > 0 && num[i] == num[i-1] && !used[i-1])) continue;
            his.add(num[i]);
            used[i] = true;
            search(num, now+1, his, used);
            used[i] = false;
            his.remove(his.size()-1);
        }
    }
}