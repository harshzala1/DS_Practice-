
import java.util.Scanner;

public class  stringbuilderr{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        sb.append(input);
        System.out.println("original "+sb);
        revercestring(sb);
        System.out.println("reverced   "+sb);

    }
    public static void revercestring(StringBuilder sb){
        for(int i=0;i<=sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
    }
}
