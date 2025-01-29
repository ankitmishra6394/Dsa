import java.util.Scanner;

public class link_list {
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
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            } else{
                new_node.next = head;
                head = new_node;
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
        link_list ll = new link_list();
        ll.cration();
        ll.traversal();
    }
}