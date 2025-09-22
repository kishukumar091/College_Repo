// WAP to set zeros at the end of array
public class Q3 {
    static void pushZerosToEnd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
