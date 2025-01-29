import java.util.Scanner;
class queue_ll {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node r = null;
    Node f = null;

    public void enqueue() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (f == null) {
                f=new_node;
                r=new_node;
        } else {
                r.next = new_node;
                r = new_node;
            }
    }
    public void dequeue() {
        if (f==null){
            System.out.println("overflow");
        } else {
            f=f.next;
        }
    }

    public void display() {
        Node temp = f;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class queue_using_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, l;
        queue_ll st = new queue_ll();
        do {
            System.out.println("PRESS 1 to enqueue:");
            System.out.println("PRESS 2 to dequeue:");
            System.out.println("PRESS 3 to display:");
            System.out.println("enter your choice:");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    st.enqueue();
                    break;
                case 2:
                    st.dequeue();
                    break;
                case 3:
                    st.display();
            }
            System.out.println("ENTER 0 TO GO BACK THE MAIN MENU");
            System.out.println("ENTER ANY KEY TO EXIT");
            l = sc.nextInt();
        } while (l==0);
        System.out.println("EXIT SUCESSFULLY");
    }
}