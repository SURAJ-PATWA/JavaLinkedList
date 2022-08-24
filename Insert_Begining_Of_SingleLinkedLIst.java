public class Insert_Begining_Of_SingleLinkedLIst {

    static  class Node{
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }



     public static Node insertBegin(Node head,int x){

        Node temp=new Node(x);
        temp.next=head;
       head=temp;
        return head;

     }

    public static void printlist(Node head){
       Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");  //10 20 30
            curr=curr.next;
        }

    }



    public static void main(String[] args) {
        Node head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        printlist(head);
    }
}
