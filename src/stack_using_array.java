import java.util.Scanner;

class stack{
    int top = -1;
    int n = 10;
    int[] a = new int[n];
    void push(){
        Scanner sc = new Scanner(System.in);
        if (top==(n-1)){
            System.out.println("Overflow");
        } else{
            System.out.println("Enter data: ");
            int i = sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");
        }
    }
    void pop(){
        if (top==-1){
            System.out.println("underflow");
        } else {
            top=top-1;
            System.out.println("item deleted");
        }
    }
    void display()
    {
        System.out.println("items are: ");
        for (int j = top; j>=0; j--){
            System.out.println(a[j]);
        }
    }

}
public class stack_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, l;

        stack st = new stack();
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
