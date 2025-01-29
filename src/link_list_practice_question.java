// Count the no of nodes in the link list.
import java.util.Scanner;

public class link_list_practice_question {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertion(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("You want to add more data press 1: ");
            n=sc.nextInt();
        } while (n==1);
    }
    public void cout(){
        int counter = 0;
        Node temp = head;
        while (temp!=null){
            counter++;
            temp=temp.next;
        }
        System.out.println("The number of the nodes int the linked list is: "+counter);
    }

    public static void main(String[] args) {
        link_list_practice_question pcll = new link_list_practice_question();
        pcll.insertion();
        pcll.cout();
    }
}
