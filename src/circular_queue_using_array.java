import java.util.Scanner;
class Cqueue{
    int f = -1;
    int r = -1;
    int n = 10;
    int[] q = new int[n];
    void enqueue(){
        Scanner sc = new Scanner(System.in);
        if (f==(r+1)%n){
            System.out.println("Overflow condition");
        } else {
            System.out.println("Enter data: ");
            int i = sc.nextInt();
            if (f == -1 && r == -1){
                f=0;
                r=0;
                q[r]=i;
            } else {
                r=(r+1)%n;
                q[r] = i;
            }
        }
    }
    void dequeue(){
        if (f == -1 && r == -1){
            System.out.println("Underflow");
        } else if (f==r) {
            System.out.println("Underflow");
            f=-1;
            r=-1;
        } else {
            f=(f+1)%n;
        }
    }
    void display() {
        System.out.println("items are: ");
        int i;
        for (i = f; i != r; i = (i + 1) % n) {
            System.out.println(q[i]);
        }
        System.out.println(q[i]);
    }
}
public class circular_queue_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, l;
        Cqueue st = new Cqueue();
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
