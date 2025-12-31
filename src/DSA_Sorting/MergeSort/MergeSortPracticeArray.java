package DSA_Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortPracticeArray {

    public static void main(String[] args) {
        int[] nums = {10,5,7,3,1,9,8,6,4,2};
        mergeSort(nums);
    }
    static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr,temp,0,arr.length-1);
        System.out.println("The sorted array is -> "+ Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int[] temp,int start, int end){

        if(start >= end)
            return;
        int mid = (start+end)/2;
        //break the given array into half and recursively call mergeSort on both halves
        mergeSort(arr,temp,start,mid);
        mergeSort(arr,temp,mid+1,end);
        //now merge the sorted arrays back into a temporary array
       merge(arr,temp,start,mid,end);
    }

    static void merge(int[] a, int[] aux,int start, int mid, int end) {
        //copy the existing segment into temp
        for(int x = start; x <=end; x++){
            aux[x] = a[x];
        }
        int i = start;
        int j = mid+1;
        int k = start;

        while(i<=mid && j<=end){
            if(aux[i] <= aux[j]){
                a[k] = aux[i];
                i++;
            }else{
                a[k] = aux[j];
                j++;
            }
            k++;
        }
        //for any left overs
        while(i <= mid){
            a[k] = aux[i];
            i++;
            k++;
        }

    }

}
