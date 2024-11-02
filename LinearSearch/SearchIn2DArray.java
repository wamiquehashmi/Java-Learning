import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] nums = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {19, 13}
        };
        int target = 13;
        int[] ans = searchIn2DArray2(nums, target);          // format of return value [row, col]
        System.out.println(searchIn2DArray(nums, target));
        System.out.println(Arrays.toString(ans));
    }

    // check if element is present or not
    static boolean searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row<arr.length; row++) {
            for (int col =0; col< arr[row].length; col++) {
                if(arr[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }

    // return index of the element
    static int[] searchIn2DArray2(int[][] arr, int target) {
        for (int row = 0; row<arr.length; row++) {
            for (int col =0; col<arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
