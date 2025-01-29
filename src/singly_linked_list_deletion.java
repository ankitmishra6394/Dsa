//
//import java.util.Scanner;
//
//public class singly_linked_list_deletion {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    Node head = null;
//    public void cration(){
//        int n,m,p;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.print("Enter Data: ");
//            int data = sc.nextInt();
//            Node new_node = new Node(data);
//            if (head==null){
//                head=new_node;
//            } else {
//                System.out.println("You want to add the element at the begining So, press 1. You want to add in the last So, press 2. You want the add in the specific position So, press 3.");
//                m = sc.nextInt();
//                switch (m)
//                {
//                    case 1:
//                        new_node.next=head;
//                        head=new_node;
//                        break;
//                    case 2:
//                        Node temp=head;
//                        while (temp.next!=null){
//                            temp=temp.next;
//                        }
//                        temp.next=new_node;
//                        break;
//                    case 3:
//                        System.out.println("Enter the position where you want to delete a  element: ");
//                        p = sc.nextInt();
//                        Node temp1 = head;
//                        for (int i = 0; i<(p-1); i++){
//                            temp1=temp1.next;
//                        }
//                        new_node.next=temp1.next;
//                        temp1.next=new_node;
//                        break;
//                }
//            }
//            System.out.print("Do you want add more data So, press 1: ");
//            n = sc.nextInt();
//        } while (n==1);
//    }
//    public void delete(){
//        int n,m,p;
//        Scanner sc = new Scanner(System.in);
//        do {
//            if (head==null){
//                System.out.println("empty");
//            } else {
//                System.out.println("You want to delete the element at the begining So, press 1. You want to add in the last So, press 2. You want the add in the specific position So, press 3.");
//                m = sc.nextInt();
//                switch (m)
//                {
//                    case 1:
//                        Node temp = head;
//                        temp=temp.next;
//                        temp=head;
//                        break;
//                    case 2:
//                        Node temp1=head;
//                        Node ptr = temp1.next;
//                        while (ptr.next!=null){
//                            temp1=ptr;
//                            ptr=ptr.next;
//                        }
//                        temp1=null;
//                        break;
//                    case 3:
//                        System.out.println("Enter the position where you want to delete a  element: ");
//                        p = sc.nextInt();
//                        Node temp2 = head;
//                        Node ptr1 = head;
//                        for (int i = 0; i<(p-2); i++){
//                            temp1=ptr1;
//                            ptr1=ptr1.next;
//                        }
//                        temp2.next=ptr1.next;
//                        break;
//                }
//            }
//            System.out.print("Do you want add more data So, press 1: ");
//            n = sc.nextInt();
//        } while (n==1);
//    }
//    public void traversal(){
//        Node temp = head;
//        if (head==null){
//            System.out.println("The linked list is empty. First add the data and try again.");
//        } else {
//            System.out.print("Data: ");
//            while (temp!=null){
//                System.out.print(temp.data+" ");
//                temp=temp.next;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        singly_linked_list_deletion ll = new singly_linked_list_deletion();
//        ll.cration();
//        ll.traversal();
//    }
//}

import java.util.Scanner;

public class singly_linked_list_deletion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    public void creation(){
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

    public void delete() {
        int m, p, q;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("LL is empty");
            } else {
                System.out.println("You want delete data from the begining press 1. you want to delete the data in the last press 2. you want delete the data a specific loaction to press 3.");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:
                        System.out.println("Enter the position where you want the delete the item: ");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < (p - 1); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.println("You want to delete more item in the linked list press 2: ");
            q = sc.nextInt();
        }while (q == 2) ;
    }

    public void traverser(){
        Node temp = head;
        if (head==null){
            System.out.println("Linked is empty first add the data in the linked list");
        } else {
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        singly_linked_list_deletion dl = new singly_linked_list_deletion();
        dl.creation();
        dl.delete();
        dl.traverser();
    }
}