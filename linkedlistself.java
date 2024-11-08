



public class linkedlistself {
    public static void main(String[] args) {
        lll l01 = new lll();
        
        l01.addFirstt(20);

        l01.addFirstt(19);
        int m = l01.getsize(); // Should print 
        System.out.println(m);

        l01.addlastt(21);
        l01.addlastt(22);
        l01.addlastt(23);
        l01.addlastt(24);
        int n = l01.getsize(); // Should print 
        System.out.println(n);

        l01.printlistt(); // Print the list

        l01.reverceelistt();
        l01.printlistt(); // Print reversed list

        l01.head = l01.recurcionrevercelist(l01.head);
        l01.printlistt(); // Print recursively reversed list


        int o = l01.getsize(); // Should print 
        System.out.println(o);


        //deleting k th node from last here we deleting second last node so idx is 2

        l01.deletefromlastkthnode(2);
        l01.printlistt();
        int z = l01.getsize(); // Should print size 
        System.out.println(z);



        //creating new list for palindrom check

        lll l02 = new lll();
        l02.addFirstt(11);
        l02.addlastt(12);
        l02.addlastt(13);
        l02.addlastt(13);
        l02.addlastt(12);
        l02.addlastt(11);
        l02.printlistt();
       System.out.println("list 1 is palindrome     "+ l01.palindromlistcheck());
       System.out.println("list 2 is palindrome    "+ l02.palindromlistcheck());
       l02.printlistt();
       l01.printlistt();
        
    }
}

class lll {
    int size;
    Nodeee head;

    public lll() {
        this.size = 0;
    }

    class Nodeee {
        int data;
        Nodeee next;

        Nodeee(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the beginning
    public void addFirstt(int data) {
        Nodeee newNode = new Nodeee(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add node at the end
    public void addlastt(int data) {
        Nodeee newNode = new Nodeee(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodeee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Print list
    public void printlistt() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Nodeee current = head;
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete first node
    public void deleteFirstt() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (size > 0) size--;
    }

    // Reverse list iteratively
    public void reverceelistt() {
        if (head == null || head.next == null) {
            return;
        }
        Nodeee prev = null;
        Nodeee current = head;
        while (current != null) {
            Nodeee nextNode = current.next;
            current.next = prev;
            //UPDATE
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    // Reverse list recursively
    public Nodeee recurcionrevercelist(Nodeee head) {
        if (head == null || head.next == null) {
            return head;
        }
        Nodeee newHead = recurcionrevercelist(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Method to get size
    public int getsize() {
        return size;
    }

    //delete node from last index 
    public void deletefromlastkthnode(int idx){
        int size = getsize();
        if(idx > size){
            System.out.println("length is greater than list");
            return;
        }
        if (idx == size) {
            deleteFirstt();
            return;
        }
        int staringidx = size-idx;
        Nodeee prNodeee = head;
        int i = 1;
        while(i<staringidx){
            prNodeee=prNodeee.next;
            i++;
        }
        prNodeee.next=prNodeee.next.next;
        this.size--;
    }


    //check palindrom list

    public boolean  palindromlistcheck(){
        if(head==null||head.next==null){
            return true;
        }
        Nodeee middle = middlefinder(head);
        Nodeee secondhalffirstnode = reverceelistt(middle);
        Nodeee firsthalffirstnode = head;
        while(secondhalffirstnode!=null){
            if(secondhalffirstnode.data!=firsthalffirstnode.data){
                return false;
            }
            secondhalffirstnode = secondhalffirstnode.next;
            firsthalffirstnode = firsthalffirstnode.next;
        }
             reverceelistt(secondhalffirstnode); // Restore the original list
             return true;
    }
    //giving reverce for palindrom approch
    public Nodeee reverceelistt(Nodeee head) {
        if (head == null || head.next == null) {
            return head;
        }
        Nodeee prev = null;
        Nodeee current = head;
        while (current != null) {
            Nodeee nextNode = current.next;
            current.next = prev;
            //UPDATE
            prev = current;
            current = nextNode;
        }
        head = prev;
        return head;
    }
    //finding middle node for palindrom or middle node finder method
    public Nodeee middlefinder(Nodeee head){
        Nodeee turtle = head;
        Nodeee rabbit = head;
        while(rabbit !=null&&rabbit.next!=null){
            turtle=turtle.next;
            rabbit=rabbit.next.next;
        }
        return turtle;
    }
}
