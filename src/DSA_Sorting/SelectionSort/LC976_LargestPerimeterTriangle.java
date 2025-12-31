package DSA_Sorting.SelectionSort;
/* 976. Largest Perimeter Triangle
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is
impossible to form any triangle of a non-zero area, return 0.
 */
import java.util.Arrays;

public class LC976_LargestPerimeterTriangle {
    public static void main(String[] args){
        int[] arr1 = {2,1,2};
        int[] arr2 = {1,2,1,10};
        System.out.println("The largest perimeter triangle is -> "+ largestPerimeter(arr1));
        System.out.println("The largest perimeter triangle is -> "+ largestPerimeter(arr2));

    }
    public static int largestPerimeter(int[] nums) {
        //sort the given number array first to get the top 3 largest sides
        Arrays.sort(nums);
        int n = nums.length;
        //for the sorted array, find first 3 sides
        for(int i=n-1; i >=2; i-- ){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if( b + c > a ){
                return a + b + c;
            }
        }
        return 0;
    }
}
