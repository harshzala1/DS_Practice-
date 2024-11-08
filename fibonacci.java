public class fibonacci {
    public static void fiboprint(int a , int b ,int n){
        if(n==0){
            return;
        }
        System.out.print((a+b)+"  ");
        fiboprint(b, a+b, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 10;
        fiboprint(a, b, n-2);
    }
}
