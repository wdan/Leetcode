public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (str == null || str.isEmpty()) return 0;
        str = str.trim();
        int st = 0;
        boolean neg = false;
        if (str.charAt(0) == '+')
            st++;
        else if(str.charAt(0) == '-'){
            st++;
            neg = true;
        }
        int ans = 0;
        while(st<str.length()){
            int now = str.charAt(st) - '0';
            if (now < 0 || now > 9) return neg ? -ans : ans;
            if (ans == 214748364 && now > 7 || ans > 214748364){
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + now;
            st++;
        }
        return neg ? -ans : ans;
    }
}