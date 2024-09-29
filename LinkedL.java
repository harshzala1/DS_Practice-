class LinkedL {
    Node head;
    private int size;

    public LinkedL() {
        this.size=0;
    }
    
    class Node{
       String data;
       Node next;

       Node(String data){
        this.data = data;
        this.next = null; 
        size++;
       }
    }
    //add opration in linked list frist 
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head==null){
          head = newNode;
          return;
        }
        newNode.next = head;
        head = newNode;
    }
     //add opration in linked list last
     public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode= currNode.next;
        }
        currNode.next = newNode;
     }

     //print linked list 
     public void printlist(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"  =>  ");
            currNode=currNode.next;
        }
        System.out.print("NULL");
      
     }
     public void deletefirst(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        size--;
        head=head.next;
        
     }
     //reverce linked list
     public void revercelist(){
        if(head==null || head.next==null ){
            System.out.println("linked list is empty");
            return;
        }
      Node prenode = head;
      Node cuuNode = head.next;
      while(cuuNode!=null){
        Node nextNode = cuuNode.next;
        cuuNode.next = prenode;
        //update
        prenode = cuuNode;
        cuuNode = nextNode;
      }
      head.next = null;
      head = prenode;
       

     }

     //delete a last node
     public void deletelast(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while(last.next!=null){
           last=last.next;
           secondlast=secondlast.next;
        }
        
        secondlast.next=null;
        
     }
     public int getsize(){
        return size;
     }
    //delete nth node from last
    public void nthlastdelete(int n){
        int a = (size+1-n);

    }
    
    public static void main(String args[]){
        LinkedL list = new LinkedL();
       list.addfirst("2");
       list.addfirst("1");
       list.addfirst("mistakeforfirdtelement");
       list.addlast("3");
       list.addlast("4");
       list.addlast("mistakeforlastelement");


       System.out.println("original list");
       list.printlist();
       System.out.println();

       System.out.println("after frist element delete");
       list.deletefirst();
       list.printlist();
       System.out.println();

       System.out.println("after last element delete");
       list.deletelast();
       list.printlist();


    
       
       System.out.println();
       System.out.println(" size of linked list is "+list.getsize());
       list.revercelist();
       System.out.println("reverce linked list is");
       list.printlist();
    }
}