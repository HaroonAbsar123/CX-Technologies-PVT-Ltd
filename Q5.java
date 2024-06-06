import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 4, 7, 9, 2, 4, 6, 3, 4, 6, 3, 4, 8, 5, 1, 5};
        int[] mostRepeated = mostRepeatedNumber(arr);
        System.out.println("Most repeated number is " + mostRepeated[0] + " repeated " + mostRepeated[1] + " times.");
    }

    public static int[] mostRepeatedNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int mostRepeated = -1;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                mostRepeated = entry.getKey();
                count = entry.getValue();
            }
        }
        return new int[]{mostRepeated, count};
    }
}
