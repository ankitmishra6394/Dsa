import java.util.Scanner;

public class doubly_linked_list_deletion {
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
    public void delete(){
        Scanner sc = new Scanner(System.in);
        int m,p,n;
        do {
            System.out.println("You want to delete the element from the beginning press 1. do you want delete the element from the last press 2. do you want delete the element from the specific location press 3.");
            m = sc.nextInt();
            switch (m){
                case 1:
                    Node temp = head;
                    temp =temp.next;
                    head = temp;
                    head.prev = null;
                    break;
                case 2:
                    Node temp1 = tail;
                    temp1 = temp1.prev;
                    temp1.next = null;
                    tail = temp1;
                    break;
                case 3:
                    System.out.println("Enter the location where you want to delete the item:");
                    p=sc.nextInt();
                    Node temp3 = head;
                    Node ptr = temp3.next;
                    for (int i = 1; i<p-1; i++){
                        temp3 = ptr;
                        ptr = ptr.next;
                    }
                    temp3.next = ptr.next;
                    ptr.next.prev = temp3;
                    break;
            }
            System.out.println("You want to delete more item form the linked list press 1: ");
            n = sc.nextInt();
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
        doubly_linked_list_deletion dlld = new doubly_linked_list_deletion();
        dlld.insertion();
        dlld.delete();
        dlld.traverser();
    }
}
