public class factorial_recursion {
    public static int factcal(int n){
        if(n==1){
            return 1;
        }
        int number = factcal(n-1);
        int ans = n*number;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(factcal(5));
    }
}
