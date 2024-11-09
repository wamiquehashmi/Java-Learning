public class CeilingAndFloor {

    public static void main(String[] args) {
        int[] arrAsc = {-12, -8, -5, 3, 6, 8, 9, 12, 23, 56, 66};
        int[] arrDec = {66, 56, 23, 12, 9, 8, 6, 3, -5, -8, -12};
        int n = 22;
        System.out.println(ceiling(arrAsc, n));        // both fun are same just the return index is different
        System.out.println(floor(arrAsc, n));
        System.out.println(ceiling(arrDec, n));
        System.out.println(floor(arrDec, n));
    }

    // Will return the greaterThan or equal to the target value index
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }                                    //            for understanding
        return start;                        // start = end + 1 --> [end, target, start]
                                             //                       ^     ^       ^
    }                                        //                     floor         ceiling

    // Will return the smallerThan or equal to the target value index
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
}

/* Output:
 * 8
 * 7
 * 3
 * 2
 */

