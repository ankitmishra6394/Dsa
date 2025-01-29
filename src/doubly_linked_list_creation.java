import java.util.Scanner;

public class doubly_linked_list_creation {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head = null;
    Node tail = null;
    public void creation(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null) {
                head = new_node;
                tail = new_node;
            } else {
                head.prev=new_node;
                new_node.next=head;
                head=new_node;
            }
            System.out.println("you want ot add more data so press 1: ");
            n=sc.nextInt();
        } while (n==1);
    }
    public void traverser(){
        Node temp = head;
        if (head==null){
            System.out.println("LL is empty.");
        } else {
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        doubly_linked_list_creation dllc = new doubly_linked_list_creation();
        dllc.creation();
        dllc.traverser();
    }
}
