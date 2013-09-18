public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (start.equals(end)) return 1;
        ArrayList<String> li = new ArrayList<String>();
        li.add(start);
        li.add(end);
        Iterator<String> it = dict.iterator();
        while(it.hasNext()){
            li.add(it.next());
        }
        int len = li.size();
        boolean[][] map = new boolean[len][len];
        boolean[]used = new boolean[len];
        for (int i=0;i<len;i++){
            used[i] = false;
            for (int j=0;j<len;j++){
                map[i][j] = isConnected(li.get(i), li.get(j));
                map[j][i] = map[i][j];
            }
        }
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
    public boolean isConnected(String a, String b){
        int count = 0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i)){
                if (count == 0)
                    count++;
                else if (count == 1)
                    return false;
            }
        }
        return true;
    }
}