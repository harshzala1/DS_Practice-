public class revercestring {
    public static void revercestring(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx)+" ");
            return;
        }
        System.out.print(str.charAt(idx)+" ");
        revercestring(str, idx-1);
    }
    public static void main(String[] args) {
        String m = "harshzala";
        revercestring(m,m.length()-1);

    }
}
