package LeetCode.Easy.TwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
1. Remove Duplicates from Sorted Array # LC26
2. Move Zeroes # LC283
3. Squares of a Sorted Array #LC977
4. Merge Sorted Array #LC88
5. Remove Element #LC27
6. Sort Colors #LC75
7. Reverse String #LC344
 */
public class ArraysWithTwoPointers {

    public static void main(String[] args){

        int[] nums11 = {1,3,9,0,0,0};
        int[] nums22 = {1,2,8};
        int m1 = 3, n1=3;

        mergeArray(nums11,m1, nums22,n1);
    }

    //4. Merge Sorted Array #LC88
    public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
    /*
        Input: nums1 = [7,9,11,0,0,0], m = 3, nums2 = [6,8,10], n = 3
        Output: [6,7,8,9,10,11]
    */
        /*if last element of nums2 < first ele of nums1 -> all ele in nums1 must move/shift by 'n' places

         */
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p1 >= 0){
            if (nums2[p2] > nums1[p1]){
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }else{
                nums1[p] = nums1[p1];
                p1--;
                p--;
            }
        }
        while(p >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
