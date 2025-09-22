public class Q19 {
    public static int findKthMissing(int[] arr, int k) {
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]<=k) k++;
            else break;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9};
        int k = 4;
        System.out.println("4th missing element is " + findKthMissing(arr, k));
    }
}
