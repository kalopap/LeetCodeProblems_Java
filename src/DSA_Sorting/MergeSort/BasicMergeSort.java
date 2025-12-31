package DSA_Sorting.MergeSort;

import java.util.Arrays;

public class BasicMergeSort {
    public static void main(String[] args){
        int[] nums1 = {5,2,10,9,1,8,5,6,3,7,4};
        System.out.println("The merge sorted array is -> "+ Arrays.toString(mergeSort(nums1)));

    }

    static int[] mergeSort(int[] original){
        if(original.length == 1)
            return original;
        //if length > 1, divide the array into two halves
        int mid = original.length/2;

        //now sort each halves by recursively calling mergeSort method
        int[] sortedLeft = mergeSort(Arrays.copyOfRange(original,0,mid));
        int[] sortedRight = mergeSort(Arrays.copyOfRange(original, mid,original.length));
        //once both halves are sorted, merge them back
        return merge(sortedLeft,sortedRight);

    }
    static int[] merge(int[] left, int[] right){
        int[] mergedArr = new int[left.length+right.length];
        //create 3 pointers to point left, right and new merged array
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                mergedArr[k] = left[i];
                i++;
            } else {
                mergedArr[k] = right[j];
                j++;
            }
            k++;
        }
        //for any leftovers in either of left or right arrays
        while(i < left.length){
            mergedArr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mergedArr[k] = right[j];
            j++;
            k++;
        }
        return mergedArr;

    }

}
