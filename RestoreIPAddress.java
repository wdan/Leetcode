import java.util.*;
public class RestoreIPAddress {
    public static ArrayList<String> ans;
    public static ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ans = new ArrayList<String>();
        LinkedList<Integer> his = new LinkedList<Integer>();
        search(s, 3, his, 0);
        return ans;
    }
    public static void search(String s, int dotLeft, LinkedList<Integer> his, int now){
        if ((dotLeft == 0)||(s.isEmpty())){
            String t = "";
            for (int i=0;i<his.size();i++){
                if (his.get(i) > 255) return;
                if (i == 0){
                    t = t + new Integer(his.get(i)).toString();
                }else{
                    t = t + "." + new Integer(his.get(i)).toString();
                }
            }
            ans.add(t);
            return;
        }
        Integer x = new Integer(s.charAt(0));
        int t = now*10 + x;
        search(s.substring(1), dotLeft, his, t);
        his.add(t);
        search(s.substring(1), dotLeft-1, his, 0);
        his.poll();
    }
    public static void main(String[] args){
        restoreIpAddresses("0000");
    }
}
