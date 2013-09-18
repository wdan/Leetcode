public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        int len = num.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<len-3;i++){
            if (i!=0 && num[i] == num[i-1]) continue;
            for (int j=len-1;j>i;j--){
                if (j!=len-1 && num[j] == num[j+1]) continue;
                int st = i+1; int ed = j-1;
                while (st < ed){
                    int sum = num[i] + num[j] + num[st] + num[ed];
                    if (st!=i+1 && num[st] == num[st-1]){
                        st++;
                    }else if (ed!=j-1 && num[ed] == num[ed+1]){
                        ed--;
                    }else if (sum > target){
                        ed--;
                    }else if (sum < target){
                        st++;
                    }else{
                        ArrayList<Integer> t = new ArrayList<Integer>();
                        t.add(num[i]);
                        t.add(num[st]);
                        t.add(num[ed]);
                        t.add(num[j]);
                        ans.add(t);
                        st++;
                        ed--;
                    }
                }
            }
        }
        return ans;
    }
}