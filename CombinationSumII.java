public class Solution {
    public static ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> combinationSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        public class Solution {
    public static ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        int[][] map = new int[num.length][2];
        int count = 0;
        map[0][0] = num[0];
        map[0][1] = 1;
        for (int i=1;i<num.length;i++){
            if (num[i]!=num[i-1]){
                count++;
                map[count][0] = num[i];
                map[count][1] = 1;
            }else{
                map[count][1]++;
            }
        }
        ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        search(map, target, 0, 0, count+1, temp);
        return ans;
    }
    public static void search(int[][] map, int target, int now, int index, int tot, ArrayList<Integer> temp){
        if (now > target) return;
        if (now == target){
            ans.add((ArrayList<Integer>)(temp.clone()));
            return;
        }
        if (index == tot) return;
        int t = map[index][0];
        search(map, target, now, index+1, tot, temp);
        while(now+t<=target && t/map[index][0] <= map[index][1]){
            temp.add(map[index][0]);
            search(map, target, now+t, index+1, tot, temp);
            t+=map[index][0];
        }
        for (int i=0;i<(t-map[index][0])/map[index][0];i++){
            temp.remove(temp.size()-1);
        }
    }
}
}