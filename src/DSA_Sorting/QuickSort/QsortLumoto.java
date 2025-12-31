package DSA_Sorting.QuickSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QsortLumoto {
    public static void main(String[] args) {
        int[] nums = {3,6,2,9,1,5,7,4};
        quick_sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    static void quick_sort(int[] A, int start, int end){
        //base case for any leaf worker: node with one or less elements - do nothing
        if(start >= end){
            return;
        }
        //for any internal node worker:
        //step 1: pick pivot
        int pivotIndex = ThreadLocalRandom.current().nextInt(start, end+1);
        int pivot = A[pivotIndex];
        //step 2: partition the array based on pivot
        //first swap the pivot with the left most element to keep it aside and work on the remaining elements
        swap(A,pivotIndex, start);
        //consider the remaining elements
        int orange = start;

        for(int green = start+1; green <= end; green++){
            if(A[green] <= pivot){
                orange++;
                swap(A,green, orange);
            }
        }
        //now there is an orange region formed with any elements are < pivot or none
        //then the final swap of the pivot element with the correct place - between orange and green sections
        //swap with the element at orange pointer which is the correct place for pivot
        swap(A,orange,start);

        //step 3: root manager recursively calling qsort on the left & right halves
        quick_sort(A,start,orange-1);
        quick_sort(A,orange+1,end);

    }

    static void swap(int[] arr,int x, int y){
        int temp = arr[x];
         arr[x] = arr[y];
        arr[y] = temp;
    }
}
