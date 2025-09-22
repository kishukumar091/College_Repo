import java.util.Arrays;

public class Q27 {
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) pre[i] = pre[i-1] + arr[i];
        return pre;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(prefixSum(arr)));
    }
}
