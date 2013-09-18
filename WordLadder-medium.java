public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (start.equals(end)) return 1;
        ArrayList<String> li = new ArrayList<String>();
        li.add(start);
        li.add(end);
        Iterator<String> it = dict.iterator();
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        int count = 1;
        while(it.hasNext()){
            String t = it.next();
            li.add(t);
            count++;
            hs.put(t, count);
        }
        hs.put(start, 0);
        hs.put(end, 1);
        int len = li.size();
        boolean[][] map = new boolean[len][len];
        boolean[]used = new boolean[len];
        for (int i=0;i<len;i++){
            used[i] = false;
            for (int j=0;j<len;j++)
                map[i][j] = false;
        }
        buildConnected(map, hs, li);
        used[0] = true;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> steps = new LinkedList<Integer>();
        queue.add(0);
        steps.add(1);
        while (queue.size()>0){
            int now = queue.poll();
            int step = steps.poll();
            for (int i=1;i<len;i++){
                if (map[now][i] && !used[i]){
                    if (i==1) return step + 1;
                    queue.add(i);
                    steps.add(step+1);
                    used[i] = true;
                }
            }
        }
        return 0;
    }
    public static void buildConnected(boolean[][] map, HashMap<String, Integer> hs, ArrayList<String> li){
        for (int i=0;i<li.size();i++){
            search(map, hs, li.get(i));
        }
    }
    public static void search(boolean[][] map, HashMap<String, Integer> hs, String s){
        int len = s.length();
        StringBuffer sb = new StringBuffer(s);
        for (int i=0;i<len;i++){
            char saved = sb.charAt(i);
            for (int j=0;j<26;j++){
                sb.setCharAt(i, (char)('a'+j));
                String t = sb.toString();
                if (hs.containsKey(t)){
                    int a = hs.get(s);
                    int b = hs.get(t);
                    map[a][b] = true;
                    map[b][a] = true;
                }
            }
            sb.setCharAt(i, saved);
        }
    }
}