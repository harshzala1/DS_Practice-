public class xtopowern {
    public static int powerr(int x, int n){
        if(n==0){
            return 1;
        }  
        int ans = x * powerr(x, n-1); 
        return ans; 
          
    }
    public static int fastpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return fastpower(x, n/2)*fastpower(x, n/2);
        }else{
            return fastpower(x, n/2)*fastpower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
       int m = powerr(x,n);
       System.out.println(m);
       int z = fastpower(x, n);
       System.out.println(z);


    }
}
