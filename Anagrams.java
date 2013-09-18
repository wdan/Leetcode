public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> ans = new ArrayList<String>();
        HashMap<String, ArrayList<String>> hs = new HashMap<String, ArrayList<String>>();
        for (String str:strs){
            char[] t = str.toCharArray();
            Arrays.sort(t);
            String key = new String(t);
            if (hs.containsKey(key)){
                hs.get(key).add(str);
            }else{
                hs.put(key, new ArrayList<String>(Arrays.asList(str)));
            }
        }
        for (ArrayList<String> e:hs.values()){
            if (e.size()>1)
                ans.addAll(e);
        }
        return ans;
    }
}