package DSA_Sorting.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QSortAList {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 9, 4, 5, 6, 7));
        quick_sort(nums);
        System.out.println(nums);
    }
    static ArrayList<Integer> quick_sort(ArrayList<Integer> arr) {
        // Write your code here.
        qsort(arr, 0, arr.size()-1);
        return arr;
    }
    static void qsort(ArrayList<Integer> A, int start, int end){
        //for leaf nodes
        if(start >= end)
            return;

        //1. Find pivot
        int low = start;
        int hi = end;
        int pivotIndex = ThreadLocalRandom.current().nextInt(low, hi+1);
        int pivot = A.get(pivotIndex);
        //System.out.println(A.get(pivot));


        //2. Partition the array into 2 parts using pivot
        while(low <= hi){
            while(A.get(low) < pivot){
                low++; //keep moving right
            }
            while(A.get(hi) > pivot){
                hi--; //keep moving left
            }
            //when the condition breaks on both ends: swap both elements
            if(low <= hi){
                int temp = A.get(low);
                A.set(low, A.get(hi));
                A.set(hi, temp);
                low++;
                hi--;
            }
        }

        //3. recursively call Quick sort on both parts
        qsort(A,start,hi);
        qsort(A,low,end);
    }

}
