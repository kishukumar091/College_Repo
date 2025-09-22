// WAP to find minimum in rotated sorted array
public class Q15 {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        // Handle single-element array
        if (arr.length == 1) return arr[0];

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;  // minimum in right half
            } else {
                high = mid;     // minimum in left half including mid
            }
        }
        return arr[low];  // low == high is minimum
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println("Minimum element is " + findMin(arr));
    }

}
