import java.util.Scanner;

public class array_deletion {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int[] a;
        int[] b;
        a = new int[n];
        b = new int[n - 1];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the array number " + i + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("enter index of  value to be deleted:");
        int m = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else {
                b[i-1] = a[i];
            }
        }

        System.out.println("Printing the array: ");
        for (int i = 0; i < n-1; i++) {
            System.out.println(b[i]);
        }
    }
}
