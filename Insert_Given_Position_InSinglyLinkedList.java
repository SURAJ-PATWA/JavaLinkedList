public class Insert_Given_Position_InSinglyLinkedList {
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

    public static Node insertPos(Node head,int pos,int data){
        Node temp=new Node(data);
        if(pos==1){
            temp.next=head;
            head=temp;
            return head;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){   // mean jo tum data position search kar rahe ho vo ho he na
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;



    }

    public static void main(String[] args) {
   Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printlist(head);   //10 20 30
        head=insertPos(head,2,15);
        printlist(head);   //10  15 20 30

    }
}











