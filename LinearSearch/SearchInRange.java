public class SearchInRange {

    public static void main(String[] args) {
        int[] nums = {23, 56, 34, 76, 84, 99, -11, -39};
        System.out.println(searchInRange(nums, 76, 1, 5));
    }

    static boolean searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length==0) {
            return false;
        }
        for (int i = start; i<=end; i++) {
            if(arr[i]==target) {
                return true;
            }
        }
        return false;
    }
}
