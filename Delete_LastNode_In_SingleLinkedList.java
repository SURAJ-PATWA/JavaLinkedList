public class Delete_LastNode_In_SingleLinkedList {
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

   public static Node delTail(Node head){
        if(head==null)return null;
        if(head.next==null) return null;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
   }


    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printlist(head);   //10 20 30
        head=delTail(head);
        printlist(head);   //10 20

    }
}
