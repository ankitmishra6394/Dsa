import java.util.Scanner;

public class modulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("enter mod value");
        int mod = sc.nextInt();
        int modulas = (num+1)%mod;
        System.out.println(modulas);
    }
}
