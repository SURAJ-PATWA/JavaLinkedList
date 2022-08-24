import java.util.*;
public class Delete_First_Node_SingleLinkedList {
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

    public static Node delHead(Node head){
        if(head==null){
            return null;
        }
        else{
            head=head.next;
            return head;
        }
    }





    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printlist(head);
        head=delHead(head);
        printlist(head);

    }
}
