public class Solution {
    public ArrayList<String> fullJustify(String[] words, int L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> ans = new ArrayList<String>();
        if (L == 0){ ans.add(""); return ans;}
        int now = 0;
        int sum = 0;
        int pre = 0;
        for (int i=0;i<words.length;i++){
            if (sum + words[i].length() > L){
                StringBuilder sb = new StringBuilder();
                int t = 0;
                for (int j=pre;j<i;j++) t+=words[j].length();
                int remain = L - t;
                int space = i - 1 - pre;
                int st = 0;
                if (space != 0)
                    st = remain % space;
                for (int j=pre;j<i;j++){
                    if (j == i-1){
                        sb.append(words[j]);
                    }else{
                        sb.append(words[j]);
                        for (int k=0;k<remain/space;k++) sb.append(" ");
                        if (st!=0 && j-pre < st) sb.append(" ");
                    }
                }
                if (space == 0) for (int j=0;j<remain;j++) sb.append(" ");
                ans.add(sb.toString());
                pre = i;
                sum = words[i].length() + 1;
            }else{
                sum += words[i].length() + 1;
            }
        }
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int j=pre;j<words.length;j++){
            sb.append(words[j]);
            cnt += words[j].length();
            if (j < words.length - 1){
                sb.append(" ");
                cnt += 1;
            }
        }
        for (int j=cnt;j<L;j++) sb.append(" ");
        ans.add(sb.toString());
        return ans;
    }
}