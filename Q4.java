import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 1, 7, 3, 2, 6};
        int[] missingNumbers = findMissingNumbers(arr);
        System.out.println("Missing numbers: " + Arrays.toString(missingNumbers));
    }

    public static int[] findMissingNumbers(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        boolean[] present = new boolean[max + 1];
        for (int num : arr) {
            present[num] = true;
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }
        return missing.stream().mapToInt(Integer::intValue).toArray();
    }
}
