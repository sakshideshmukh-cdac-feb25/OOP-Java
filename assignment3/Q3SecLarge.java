
import java.util.*;

class Q3SecLarge {

    static int seclarge(int arr[]) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " );
            arr[i] = sc.nextInt();
        }

        int secondLargest = seclarge(arr);
        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }

        sc.close();
    }
}
