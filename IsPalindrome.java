public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s==null || s.isEmpty()) return true;
        s = s.trim().toLowerCase();
        int st = 0, ed = s.length() - 1;
        while (st<=ed){
            while(st<=ed && !check(s.charAt(st))) st++;
            while(st<=ed && !check(s.charAt(ed))) ed--;
            if (st<=ed && s.charAt(st)!=s.charAt(ed))
                return false;
            st++;
            ed--;
        }
        return true;
    }
    public boolean check(char x){
        if (x >='a' && x <= 'z') return true;
        else if (x>='0' && x <= '9') return true;
        return false;
    }
}