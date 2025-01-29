import java.util.Scanner;
class stack1{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(){
        Scanner sc  = new Scanner(System.in);
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (top==null){
                top=new_node;
            } else {
                new_node.next = top;
                top = new_node;
            }
        }
        void pop(){
        if (top==null){
            System.out.println("stack is empty");
        } else {
            top = top.next;
        }
    }
    void display(){
        Node temp = top;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class stack_using_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,l;
        stack1 st = new stack1();
        do {
            System.out.println("PRESS 1 to push:");
            System.out.println("PRESS 2 to pop:");
            System.out.println("PRESS 3 to display:");
            System.out.println("enter your choice:");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    st.push();
                    break;
                case 2:
                    st.pop();
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
