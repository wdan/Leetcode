public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (num.length<3) return 0;
        Arrays.sort(num);
        int closet = num[0] + num[1] + num[2];
        for (int i=0;i<num.length-2;i++){
            if (i>0 && num[i] == num[i-1]) continue;
            int st = i + 1;
            int ed = num.length - 1;
            while(st < ed){
                int now = num[i] + num[st] + num[ed];
                int diff = now - target;
                if (Math.abs(diff) < Math.abs(closet - target))
                    closet = now;
                if (now == target){
                    return target;
                }else if (now > target){
                    ed--;
                }else
                    st++;
            }
        }
        return closet;
    }
}