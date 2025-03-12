public class RemoveDuplicates {
    
    public static int removeDuplicates(int[] nums) {
        // If the array is empty or has only one element, return the length as is
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 1;

        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If current element is not equal to the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++; 
            }
        }

       
        return j;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        
        int length = removeDuplicates(nums);

       
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
