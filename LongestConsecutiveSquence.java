public class Solution {
    public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        int max = 1;
        for (int e:num){
            if (hs.containsKey(e)) continue;
            hs.put(e, 1);
            if (hs.containsKey(e - 1)){
                max = Math.max(max, merge(hs, e - 1 , e));
            }
            if (hs.containsKey(e + 1)){
                max = Math.max(max, merge(hs, e, e+1));
            }
        }
        return max;
    }
    public static int merge(HashMap<Integer, Integer> hs, int left, int right){
        int ed = right + hs.get(right) - 1;
        int st = left - hs.get(left) + 1;
        int len = ed - st + 1;
        hs.put(st, len);
        hs.put(ed, len);
        return len;
    }
}