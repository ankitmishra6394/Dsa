import java.util.Scanner;

public class singly_linked_list_insertion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void cration(){
        int n,m,p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            } else {
                System.out.println("You want to add the element at the begining So, press 1. You want to add in the last So, press 2. You want the add in the specific position So, press 3.");
                m = sc.nextInt();
                switch (m)
                {
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        break;
                    case 2:
                        Node temp=head;
                        while (temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                        break;
                    case 3:
                        System.out.println("Enter the position where you want to add a new element: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i<(p-1); i++){
                            temp1=temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;
                }
            }
            System.out.print("Do you want add more data So, press 1: ");
            n = sc.nextInt();
        } while (n==1);
    }
    public void traversal(){
        Node temp = head;
        if (head==null){
            System.out.println("The linked list is empty. First add the data and try again.");
        } else {
            System.out.print("Data: ");
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        singly_linked_list_insertion ll = new singly_linked_list_insertion();
        ll.cration();
        ll.traversal();
    }
}