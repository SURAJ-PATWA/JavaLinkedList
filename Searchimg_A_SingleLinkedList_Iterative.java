public class Searchimg_A_SingleLinkedList_Iterative {
    static  class Node{
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

    }

    public static int search(Node head,int x){
      int pos=1;
      Node curr=head;
      while(curr!=null){
          if(curr.data==x) {
              return pos;
          }
          else{
              pos++;
              curr=curr.next;
          }
      }

     return -1;
    }
    
    public static void main(String[] args) {
       Node  head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printlist(head);   //10 20 30
        System.out.println(search(head,20)); // 2

}
}
