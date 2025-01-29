public class problem01_array_reverse {
    static void reverserarrya(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i<n; i++){
            temp[i] = arr[ n - i - 1];
        }
        for (int i = 0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,15,11,12};
        reverserarrya(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

