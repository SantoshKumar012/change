
class Jump{
    // To determine if last index is reachable
    public boolean canJump(int[] nums) {
        // Initialize maximum index
        int maxIndex = 0;

        // Iterate through each index of the array
        for (int i = 0; i < nums.length; i++) {
            /* If the current index 
               is greater than the 
               maximum reachable index
               it means we cannot move 
               forward and should 
               return false */
            if (i > maxIndex) {
                return false;
            }

            /* Update the maximum index that can be 
               reached by comparing
               the current maxIndex with the sum 
               of the current index and
               the maximum jump from that index */
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        /* If we complete the 
           loop, it means we 
           can reach the 
           last index */
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 1, 2};

        System.out.print("Array representing maximum jump from each index: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Jump solution = new Jump();
        boolean ans = solution.canJump(nums);

        if (ans) {
            System.out.println("It is possible to reach the last index.");
        } else {
            System.out.println("It is not possible to reach the last index.");
        }
    }
}

