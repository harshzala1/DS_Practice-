public class towerofhenoi {
    public static void TOH(int n,String scr,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk  "+n+"  from  "+scr+"  to  "+dest);
            return;
        }
        TOH(n-1, scr, dest, helper);
        System.out.println("transfer disk  "+n+"  from  "+scr+"  to  "+dest);
        TOH(n-1, helper, scr, dest);
    }
    public static void main(String[] args) {
        int n=3;
        TOH(n,"S", "H", "D");
    }
}
