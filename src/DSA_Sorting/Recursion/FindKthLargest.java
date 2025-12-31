package DSA_Sorting.Recursion;

import java.util.concurrent.ThreadLocalRandom;

public class FindKthLargest {

    public static void main(String[] args){
        int[] nums = {3,6,2,9,1,5,7,4};
        findkthLargest(nums,3);

    }

    static void findkthLargest(int[] A, int k){
        //using Quick sort implementation to sort only the right half of the pivot since we're interested only in the largest elements,
        // which will be on the right side
        int n = A.length;
        quick_select(A, 0,n-1,n-k);
        //after the array is sorted, the element is present at the n-k index
        System.out.println("The kth largest element is -> " + A[n-k]);
    }
    static void quick_select(int[] arr,int start, int end,int index) {
        //base case: leaf manager has atleast 1 partition to work on
        if(start >= end)
            return;
        //recursive case: internal node manager does the Lomuto partition based on pivot
        int pivotIndex = ThreadLocalRandom.current().nextInt(start,end+1);
        int pivot = arr[pivotIndex];

        //swap the left most element with the pivot index to keep it aside
        swap(arr, pivotIndex,start);

        int orange = start;
        for(int green = start+1; green <= end; green++){
            if(arr[green] <= pivot){
                orange++;
                swap(arr,orange,green);
            }
        }
        //now the array has orange and green partitions, now we put the pivot in between these 2
        swap(arr,start,orange);
        //now which partition to look for to find kth element?
        if(orange == index){ //lucky case
            return;
        }else if(orange < index){ //k is in the right partition
            quick_select(arr,orange+1,end,index);
        }else { //orange > index, k is in the left partition
            quick_select(arr,start,orange-1,index);
        }

    }
    static void swap(int[] A, int x, int y){
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
