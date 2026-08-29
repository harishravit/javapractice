package atoz_Striver_DSA.Search;

public class Binary_search {
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        System.out.println(left + (right - left) / 2);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid])
                return mid;
            else if (arr[mid] > target) {
                left++;
            } else
                right--;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] asearr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // System.out.println(binarySearch(asearr, 1));
        int[] desarr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(binarySearch(desarr, 1));
    }
}
