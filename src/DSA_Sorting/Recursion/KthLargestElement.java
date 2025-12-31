package DSA_Sorting.Recursion;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class KthLargestElement {
    public static void main(String[] args){
        int[] nums = {3,8,5,9,2,7,6,1,4};
        int n = nums.length;
        int k = 3;
        quick_select(nums,0,n-1,n-k);
        System.out.println("The array now is -> "+ Arrays.toString(nums));
        System.out.println("The kth largest element is ->"+nums[n-k]);
    }
    static void quick_select(int[] A,int start, int end, int index){
        //base case, leaf node
        if(start >= end)
            return;
        //recursive case, internal node
        //step 1: pick pivot
        int pivotIndex = ThreadLocalRandom.current().nextInt(start,end+1);
        int pivot = A[pivotIndex];
        //step 2: partition the array based on pivot
        //swap the pivot element with the left most element
        swap(A,start,pivotIndex);
        //now work on the remaining elements
        int orange = start;
       for(int green = start+1; green <= end; green++){
           if(A[green] <= pivot){
               //paint it orange
               orange++;
               swap(A,green,orange);
           }
       }
       //now the partition is done, put the pivot back in its final place
       swap(A,orange,start);
       //find where the required index is
        if(index == orange){
            return;
        }else if(index > orange){
            quick_select(A,orange+1,end,index);
        }else{
            quick_select(A,start,orange-1,index);
        }


    }
    static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
