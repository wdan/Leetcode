public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0) return false;
        int n = 0;
        int t = x;
        while(t>0){
            n++;
            t/=10;
        }
        int mod = (int)(Math.pow(10, n - 1));
        while(x>=10){
            int a = x / mod;
            int b = x % 10;
            if (a!=b) return false;
            x %= mod;
            x /=10;
            mod/=100;
        }
        return true;
    }
}