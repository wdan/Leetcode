public class ValidNumber{
    public static void main(String[] args){
        System.out.println(isNumber("+.1"));
    }
    public static boolean isNumber(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s==null || s.isEmpty()) return false;
        int eCount = 0;
        int dotCount = 0;
        int st = 0;
        while(st < s.length() && s.charAt(st) == ' ') st++;
        int ed = s.length() - 1;
        while(ed >= 0 && s.charAt(ed) == ' ') ed--;
        if (st > ed) return false;
        for (int i=st;i<=ed;i++){
            if (Character.isDigit(s.charAt(i)))
                continue;
            else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && eCount == 0){
                if (i+1<=ed && Character.isDigit(s.charAt(i+1))){
                    eCount++;
                    continue;
                }
            }else if (s.charAt(i) == '.'){
                if (dotCount == 0){
                    System.out.println(i);
                    System.out.println(st);
                    System.out.println(ed);
                    if ((i-1>=st && Character.isDigit(s.charAt(i-1)) && (i == ed || Character.isDigit(s.charAt(i+1)))) || 
                    (i+1<=ed && Character.isDigit(s.charAt(i+1)) && (i == st || Character.isDigit(s.charAt(i-1))))){
                        dotCount++;
                        continue;
                    }else 
                        return false;
                }else
                    return false;
            }else if (s.charAt(i) == '-' || s.charAt(i) == '+'){
                if (i == st && i+1<=ed && (Character.isDigit(s.charAt(i+1))||s.charAt(i+1)=='.')){
                    st++;
                    continue;
                }
                else
                    return false;
            }else
                return false;
        }
        return true;
    }
}
