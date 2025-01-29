import java.util.Scanner;

public class array_2d
{
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        n = sc.nextInt();
        System.out.println("Enter the columm:");
        m = sc.nextInt();
        System.out.println("enter values: ");
        int a[][] = new int[n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                a[i][j] = sc.nextInt();
                 }
            }
        System.out.println();
        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
