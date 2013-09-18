public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(num.length < 3) return ans;
        int res = num[0] + num[1] + num[2];
        for (int i=0;i<num.length - 2;i++){
            if (i>0 && num[i] == num[i-1]) continue;
            int start = i + 1;
            int end = num.length - 1;
            while(start<end){
                int sum = num[i] + num[start] + num[end];
                if (sum == 0){
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(num[i]);
                    al.add(num[start]);
                    al.add(num[end]);
                    ans.add(al);
                    do { start++; } while (start<end && num[start]==num[start-1]);
                    do { end--; } while (start<end && num[end]==num[end+1]);
                }else if (sum > 0){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return ans;
    }
}