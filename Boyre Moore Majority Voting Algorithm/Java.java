import java.util.Scanner;

public class MajorityElement {
    public static int majority(int[] arr, int n) {
        int candidate = -1;
        int vote = 0;
        for (int i = 0; i < n; i++) {
            if (vote == 0) {
                candidate = arr[i];
                vote = 1;
            } else {
                if (arr[i] == candidate) {
                    vote++;
                } else {
                    vote--;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        return count > n / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Majority element is: " + majority(arr, n));
    }
}
