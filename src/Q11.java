public class Q11 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;

        int index = -1;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Last occurrence of " + target + " is at index " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
