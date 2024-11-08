public class firstandlastoccu {
    public static int first = -1;
    public static int last = -1;
    public static void findfristlastocuu(String str,int idx,char m){
        if(idx==str.length()-1){
            System.err.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)==m){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findfristlastocuu(str, idx+1, m);
    }
    public static void main(String[] args) {
        String check = "zalaharsh";
        findfristlastocuu(check,0, 'a');
    }
}
