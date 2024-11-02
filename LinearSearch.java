public class LinearSearch {
    
    public static void main(String[] args) {
        int[] nums = {15, 46, 43, 65, 78, 88};
        int index = linearSearch(nums, 65);
        System.out.println(index);
        System.out.println(linearSearch2(nums, 66));
    }

    // return the index of the element
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i< arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    // check if element is present or not
    static boolean linearSearch2(int[] arr, int target) {
        for (int element: arr) {
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
