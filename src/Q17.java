//	WAP to find how many times an array has been rotated
public class Q17 {
    public static int countRotations(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) low = mid + 1;
            else high = mid;
        }
        return low; // index of minimum element = rotations
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println("Array rotated " + countRotations(arr) + " times");
    }
}
