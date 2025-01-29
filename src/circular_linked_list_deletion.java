import java.util.Scanner;

public class circular_linked_list_deletion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;
    public void creation(){
        Scanner sc  = new Scanner(System.in);
        int p,n,m;
        do {
            System.out.println("enter data");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
                new_node.next=head;
            } else {
                System.out.println("do you want enter the data in the starting So, press 1. at add in last to press 2. at add in specific position press 3: ");
                m = sc.nextInt();
                switch (m)
                {
                    case 1:
                        new_node.next=head;
                        head=new_node;
                        tail.next=head;
                        break;
                    case 2:
                        tail.next=new_node;
                        tail=new_node;
                        new_node=head;
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
            System.out.println("do you want add more data to press 1.");
            n=sc.nextInt();
        } while (n==1);
    }
    public void delete(){
        int m,p,n;
        Scanner sc = new Scanner(System.in);
        do {
            if (head==null){
                System.out.println("Circular ll is empty");
            } else {
                System.out.println("do you want delete the item from the starting press1. do you want to delete the item from the specific location press 3");
                m = sc.nextInt();
                switch (m){
                    case 1:
                        Node temp = head;
                        temp=temp.next;
                        temp=head;
                        tail.next=head;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr!=head){
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=head;
                        tail=head;
                        break;
                    case 3:
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        System.out.println("enter the location where you want to delete the item: ");
                        p=sc.nextInt();
                        for (int i =0; i<(p-1); i++){
                            temp2=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp2.next=ptr1.next;
                        break;
                }
            }
            System.out.println("do you want delete the more item from the press 1:");
            n=sc.nextInt();
        } while(n==1);
    }
    public void traverser(){
        Node temp = head;
        if (head==null){
            System.out.println("LL is empty");
        } else {
            do {
                System.out.println(temp.data+" ");
                temp=temp.next;
            } while (temp!=head);
        }
    }

    public static void main(String[] args) {
        circular_linked_list_deletion cli = new circular_linked_list_deletion();
        cli.creation();
        cli.delete();
        cli.traverser();
    }
}
