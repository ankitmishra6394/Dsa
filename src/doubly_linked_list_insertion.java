import java.util.Scanner;

public class doubly_linked_list_insertion {
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

    public void insertion(){
        Scanner sc = new Scanner(System.in);
        int m,p,n;
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
            } else {
                System.out.println("Do you want insert the data from the starting press 1. you want insert the data from the last 2. you want to add the data in the specific location 3.");
                m = sc.nextInt();
                switch (m)
                {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 3:
                        System.out.println("Enter the location where you want to add the new data");
                        p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 1; i<p-1; i++){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        new_node.prev = temp;
                        new_node.next = ptr;
                        temp.next = new_node;
                        ptr.prev = new_node;
                        break;
                }
            }
            System.out.println("Do you want add more data so press 1: ");
            n =sc.nextInt();
        } while (n==1);
    }
    public void traverser(){
        Node temp = head;
        if (head==null){
            System.out.println("LL is empty");
        } else {
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        doubly_linked_list_insertion dlli = new doubly_linked_list_insertion();
        dlli.insertion();
        dlli.traverser();
    }
}
