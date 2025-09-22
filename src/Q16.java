//	WAP to find Maximum in rotated sorted array
public class Q16 {
    public static int findMax(int[] arr) {
        int low = 0, high = arr.length - 1;

        // Handle single-element array
        if (arr.length == 1) return arr[0];

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid is greater than high, max is in right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else { // max is in left half including mid-1
                high = mid;
            }
        }

        // After loop, low points to minimum, so maximum is just before it
        return arr[(low - 1 + arr.length) % arr.length];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        int max = findMax(arr);
        System.out.println("Maximum element is " + max);
    }
}
