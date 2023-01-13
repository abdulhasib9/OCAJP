import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {

        int [] numbers ={1,4,5,6,7};
        //binary search utility functions
        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,3));
        System.out.println(Arrays.binarySearch(numbers,12));
        System.out.println(Arrays.binarySearch(numbers,7));
        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,151));


        //trying binary search with non-sorted arrays
        System.out.println("non sorted arrays ");
        int notSortedArray [] = {2,4,55,1,3,55};

        //if the array is not sorted the result is unpredictable
        //we can solve this problem by sorting the array
        System.out.println(Arrays.binarySearch(notSortedArray,3));
        System.out.println(Arrays.binarySearch(notSortedArray,55));
        System.out.println(Arrays.binarySearch(notSortedArray,32));
        System.out.println(Arrays.binarySearch(notSortedArray,1));

    }
}
