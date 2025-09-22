//WAP to remove duplicates from sorted array 2
public class Q5 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};

        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
