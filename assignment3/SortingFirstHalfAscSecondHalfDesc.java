public class SortingFirstHalfAscSecondHalfDesc {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 4, 8, 9, 6};

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
          for (int j = i + 1; j < arr.length; j++) {
              if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("first half in ascending: ");
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("second half in descending: ");
        for (int i = arr.length-1; i > arr.length/2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}