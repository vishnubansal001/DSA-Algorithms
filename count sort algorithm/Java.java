import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountSort {
    public static void sort(List<Integer> arr) {
        int maxi = Collections.max(arr);
        int mini = Collections.min(arr);

        int range = maxi - mini + 1;
        List<Integer> count = new ArrayList<>(Collections.nCopies(range, 0));
        List<Integer> output = new ArrayList<>(Collections.nCopies(arr.size(), 0));
        for (int i = 0; i < arr.size(); i++) {
            count.set(arr.get(i) - mini, count.get(arr.get(i) - mini) + 1);
        }
        for (int i = 1; i < count.size(); i++) {
            count.set(i, count.get(i) + count.get(i - 1));
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            output.set(count.get(arr.get(i) - mini) - 1, arr.get(i));
            count.set(arr.get(i) - mini, count.get(arr.get(i) - mini) - 1);
        }
        arr.clear();
        arr.addAll(output);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        System.out.println("Array before sorting: " + arr);

        sort(arr);

        System.out.println("Array after sorting: " + arr);
    }
}
