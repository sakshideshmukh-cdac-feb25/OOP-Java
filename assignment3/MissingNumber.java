public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {1, 2, 4, 6, 3, 7, 8};  // Missing number is 5
        int n = 8;  // Numbers should be from 1 to 8

        // Find and print the missing number
        System.out.println("The missing number is: " + findMissingNumber(arr, n));
    }
}
