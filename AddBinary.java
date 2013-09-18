public class AddBinary {
    public static void main(String[] args){
        System.out.println(addBinary("1", "111"));
    }
    public static String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer sb = new StringBuffer();
        int remain = 0;
        int nowA = a.length() - 1;
        int nowB = b.length() - 1;
        Integer tA, tB;
        while(nowA >=0 || nowB >=0){
            if (nowA >= 0)
                tA = new Integer(a.charAt(nowA) - '0');
            else
                tA = 0;
            if (nowB >= 0)
                tB = new Integer(b.charAt(nowB) - '0');
            else
                tB = 0;
            int sum = tA + tB + remain;
            if (sum >=2){
                sum = sum - 2;
                sb.append((char)('0' + sum));
                remain = 1;
            }else{
                remain = 0;
                sb.append((char)('0' + sum));
            }
            nowA--;
            nowB--;
        }
        if (remain!=0)
            sb.append('1');
        return sb.reverse().toString();
    }
}
