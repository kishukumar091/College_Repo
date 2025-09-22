public class Q30 {
    public static int findPivot(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == total - leftSum - arr[i]) return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println("Pivot index is " + findPivot(arr));
    }
}
