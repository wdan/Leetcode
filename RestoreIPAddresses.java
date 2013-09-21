public class Solution {
    public static ArrayList<String> ans;
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null) return null;
        ans = new ArrayList<String>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        search(s, 0, 0, 4, temp);
        return ans;
    }
    public static void search(String s, int index, int pre, int remain, ArrayList<Integer> temp){
        if (remain == 0 && index == s.length()){
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<temp.size();i++){
                Integer t = new Integer(temp.get(i));
                sb.append(t.toString());
                sb.append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            ans.add(sb.toString());
        }
        if (index >= s.length() || remain == 0) return;
        if (index - pre < 3){
            if (index != pre && s.charAt(pre) == '0') return;
            search(s, index+1, pre, remain, temp);
            String t = s.substring(pre, index+1);
            Integer slice = new Integer(t);
            if (slice >= 0 && slice <= 255){
                temp.add(slice);
                search(s, index+1, index+1, remain-1, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}