
import java.util.Scanner;

public class usebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int m = sc.nextInt();
        System.out.println("enter the checking index from right");
        int n = sc.nextInt();
        int bitmask = 1<<n;
        if((bitmask&m)==0){
            System.out.print("number is zeroooo");
        }else{
            System.out.print("number is oneeeee");
        }
        //set but
        

    }
}
