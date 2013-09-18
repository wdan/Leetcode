public class ReverseInteger {
    public static int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuilder s = new StringBuilder(new Integer(x).toString());
        int len = s.length();
        int st = 0;
        if (s.charAt(0)=='-')
            st = 1;
        for (int i=st,j=len-1;i<=j;i++,j--){
            char t = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, t);
        }
        return new Integer(s.toString());
    }
    public static void main(String[] args){
        System.out.println(reverse(0));
    }
}
