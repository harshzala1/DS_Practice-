
import java.util.LinkedList;

public class linkeddlist {
    public static void main(String[] args) {
        LinkedList<String> list = new  LinkedList<String>();
        list.addFirst("am");
        list.addFirst("i"); 
        list.add("harsh");
        System.out.println(list);
        list.addLast("zala");
        System.out.println(list);
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        list3.add(1);
        list3.add(2);
        System.out.println(list3);
    }
} 
