public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // numbers are from 1 to 6
        int missing = findMissing(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}