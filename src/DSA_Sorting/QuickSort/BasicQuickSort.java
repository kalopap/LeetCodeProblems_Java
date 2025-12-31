package DSA_Sorting.QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BasicQuickSort {

    public static void main(String[] args) {
        int[] nums = {5, 8, 3, 9, 4, 1, 7};//{21,18,24,15,12,28,14,11,12};//{5,1,3,7,9,2,6};
        qsort(nums,0,nums.length-1);
        //quickSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] A, int low, int hi){
        if(low >= hi){
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end-start)/2;
        int pivot = A[mid];

        while(start <= end){
            while(A[start] < pivot) {
                start++;
            }
            while(A[end] > pivot) {
                end--;
            }
            if(start <= end){
                //swap
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(A, low, end);
        quickSort(A, start,hi);

    }

    //quick sort using pivot index as any random number instead of mid
    static void qsort(int[] arr, int start, int end){
        if(start >= end)
            return;
        //1. find pivot
        int first = start;
        int last = end;

        int pivot = ThreadLocalRandom.current().nextInt(first,last+1);

        //2.partition left and right of pivot
        while(first <= last){
            while(arr[first] < arr[pivot]){
                first++;
            }
            while(arr[last] > arr[pivot]){
                last--;
            }
            if(first <= last){
                //swap both numbers
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
        }

        //3. recursively call qsort
        qsort(arr,start, pivot);
        qsort(arr,pivot+1,end);

    }
}
