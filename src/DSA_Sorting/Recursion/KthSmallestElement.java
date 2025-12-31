package DSA_Sorting.Recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class KthSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(3,8,5,9,2,7,6,1,4));
        int k = 0;
       int g = quick_select_smallest(numsList,k);
        System.out.println("The kth smallest element is -> "+ g);
    }
    static Integer quick_select_smallest(ArrayList<Integer> nums,int k){
        int n = nums.size();
        if(k <= n && k > 0) {
            quick_select(nums, 0, n - 1, k - 1);
            return nums.get(k - 1);
        }else{
            return -1;
        }

    }
    static void quick_select(ArrayList<Integer> A,int start, int end, int index){
        //base case, leaf node
        if(start >= end) return;

        //recursive case, internal  node
        //step 1: pick pivot
        int pivotIndex = ThreadLocalRandom.current().nextInt(start, end+1);
        int pivot = A.get(pivotIndex);
        //step 2: partition the list based on pivot
        //swap pivot with leftmost element
        swap(A,start,pivotIndex);
        int orange = start;
        for(int green = start+1; green <=end; green++){
            if(A.get(green) <= pivot){
                orange++;
                swap(A,green,orange);
            }
        }
        //list is partition, swap pivot with orange
        swap(A,start,orange);
        //step 3: recurse based on where n-k(index) element is
        if(index == orange){
            return;
        }else if(index < orange){//k-1 is on left side of pivot
            quick_select(A,start,orange-1,index);
        }else{ //k-1 is on the right side of pivot
            quick_select(A,orange+1,end,index);
        }

    }
    static void swap(ArrayList<Integer> arr, int x, int y){
        int temp = arr.get(x);
        arr.set(x,arr.get(y));
        arr.set(y,temp);
    }
}
