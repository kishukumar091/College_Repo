import java.util.Arrays;

public class Q28 {
    public static int[] suffixSum(int[] arr) {
        int n = arr.length;
        int[] suf = new int[n];
        suf[n-1] = arr[n-1];
        for (int i = n-2; i >=0; i--) suf[i] = arr[i] + suf[i+1];
        return suf;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(suffixSum(arr)));
    }
}
