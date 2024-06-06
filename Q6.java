import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 7, 6};
        int[] rotatedArr = rotateArray(arr);
        System.out.println("Rotated array: " + Arrays.toString(rotatedArr));
    }

    public static int[] rotateArray(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        return arr;
    }
}
