public class KadaneAlgorithm {
    public static long maxSum(int[] arr) {
        int n = arr.length;
        long curr = 0;
        long maxi = arr[0];

        for (int i = 0; i < n; i++) {
            curr += arr[i];
            if (curr > maxi) {
                maxi = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        long maxSum = maxSum(arr);
        System.out.println("Maximum sum of subarray: " + maxSum);
    }
}
