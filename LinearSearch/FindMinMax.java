public class FindMinMax {

    public static void main(String[] args) {
        int[] nums = {23, 56, 34, 76, 84, 99, -11, -39};
        System.out.println(findMin(nums));
        System.out.println(findMax(nums));
    }

    // find min element in array
    static int findMin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // find max element in array
    static int findMax(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
