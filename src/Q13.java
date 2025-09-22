// WAP to find Peak element from array
public class Q13 {
    public static int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid]; // peak found
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1; // move left
            } else {
                low = mid + 1;  // move right
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeak(arr);
        System.out.println("A peak element is " + peak);
    }
}
