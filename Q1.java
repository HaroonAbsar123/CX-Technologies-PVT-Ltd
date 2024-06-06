import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 4, 6, 9};
        int[] sortedArr = sortArrayDescending(arr);
        System.out.println("Sorted array in descending order: " + Arrays.toString(sortedArr));
    }

    public static int[] sortArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
