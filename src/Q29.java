public class Q29 {
    private int[] prefix; // prefix sum array

    // Constructor: builds prefix sum array
    public Q29(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1]; // prefix[0] = 0
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    // Returns sum of elements from index left to right (inclusive)
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    // Main method must be inside class
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Q29 rsq = new Q29(nums);

        System.out.println("Sum from index 0 to 2: " + rsq.sumRange(0, 2)); // 6
        System.out.println("Sum from index 1 to 3: " + rsq.sumRange(1, 3)); // 9
        System.out.println("Sum from index 2 to 4: " + rsq.sumRange(2, 4)); // 12
    }
}
