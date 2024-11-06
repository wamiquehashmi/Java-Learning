public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arrAsc = {-12, -8, -5, 3, 6, 8, 9, 12, 23, 56, 66};
        int[] arrDec = {66, 56, 23, 12, 9, 8, 6, 3, -5, -8, -12};
        int n = 56;
        System.out.println(orderAgnosticBinarySearch(arrAsc, n));
        System.out.println(orderAgnosticBinarySearch(arrDec, n));
    }

    // binary search irrespective of the sorting order
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {                         // if ascending
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {                             // if descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
