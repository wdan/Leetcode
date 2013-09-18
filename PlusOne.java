public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] ans = new int[digits.length];
        int remain = 1;
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i] == 9 && remain == 1){
                ans[i] = 0;
                remain = 1;
            }else{
                ans[i] = digits[i] + remain;
                remain = 0;
            }
        }
        if (remain == 1){
            int[] ans2 = new int[digits.length+1];
            ans2[0] = 1;
            for (int i=1;i<ans2.length;i++){
                ans2[i] = ans[i-1];
            }
            return ans2;
        }else
            return ans;
    }
}