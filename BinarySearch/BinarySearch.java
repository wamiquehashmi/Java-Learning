public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-12, -8, -5, 3, 6, 8, 9, 12, 23, 56, 66};
        int n = 56;
        System.out.println(binarySearch(arr, n));
    }

    // returns the target index
    static int binarySearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = start + (end-start)/2;      // might be possible tht (start+end) exceeds the range
            if (target<arr[mid]) {
                end = mid-1;                      // for second half
            } else if (target>arr[mid]) {
                start = mid+1;                    // for first half
            } else {
                return mid;                       // element found
            }
        }
        return -1;
    }
}
