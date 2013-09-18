public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null || s.isEmpty()) return 0;
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        int len = s.length();
        int sum = hs.get(s.charAt(len-1));
        for (int i=len-2;i>=0;i--)
            if (hs.get(s.charAt(i)) < hs.get(s.charAt(i+1)))
                sum -= hs.get(s.charAt(i));
            else
                sum += hs.get(s.charAt(i));
        return sum;
    }
}