
import java.util.*;
public class problem02_array_median_of_sorted_array {
    static double medianof(int[] a, int[] b){
//        merge the two array
        int[]  c = new int[a.length + b.length];
        System.arraycopy(a,0,c,0, a.length);
        System.arraycopy(b,0,c, a.length, b.length);
//        sorting the array
        Arrays.sort(c);
//        System.out.println(c);
        int len = c.length;
//        if the length of the array is even
        if (len % 2 == 0){
            return (c[len/2]+ c[len/2-1])/2.0;
        }
        else {
            return c[len/2];
        }
    }

    public static void main(String[] args) {
        int[] a = {10,50,60};
        int[] b = {100,20};
        System.out.println(medianof(a, b));
    }
}
