import java.util.Scanner;

public class array_1d
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the array number "+ i + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("Printing the array: ");
        for (int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}