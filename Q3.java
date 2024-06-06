public class Q3 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 5, 11, 19};
        int sumOfTwoLargest = sumOfTwoLargestNumbers(arr);
        System.out.println("Sum of two largest numbers: " + sumOfTwoLargest);
    }

    public static int sumOfTwoLargestNumbers(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max1 + max2;
    }
}
