//	WAP to find first occurrence of an element
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20, 50};
        int target = 20;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;  // stop at first match
            }
        }

        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

}
