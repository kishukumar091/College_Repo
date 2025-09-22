//	WAP to find total occurrence of an element
public class Q12 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++; // increment count for each match
            }
        }

        System.out.println("Total occurrences of " + target + " is " + count);
    }
}
