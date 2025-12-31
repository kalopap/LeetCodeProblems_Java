package DSA_Sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortPracticeAList {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(10,5,7,3,1,9,8,6,4,2));
        mergeSort(aList);
    }
    static void mergeSort(ArrayList<Integer> nums){
        ArrayList<Integer> tempList = new ArrayList<>(Collections.nCopies(nums.size(),0));
        mergeSort(nums,tempList,0,nums.size()-1);
        System.out.println(nums);

    }
    static void mergeSort(ArrayList<Integer> original, ArrayList<Integer> temp, int start, int end){
        if(start >= end)
            return;
        //1. divide the list into 2 halves
        int mid = (start+end)/2;
        //2. sort both halves recursively
        mergeSort(original,temp,start,mid);
        mergeSort(original,temp,mid+1,end);

        //3. merge them back together
        merge(original,temp, start, mid,end);

    }

    static void merge(ArrayList<Integer> original, ArrayList<Integer> temp, int start, int mid, int end){
        //copy the contents of original into temp list
        for(int x=start; x<=end; x++){
            temp.set(x,original.get(x));
        }
        int i = start;
        int j = mid+1;
        int k = start;

        while( i <=mid && j <=end){
            if(temp.get(i) <= temp.get(j)){
                original.set(k,temp.get(i));
                i++;
            }else{
                original.set(k, temp.get(j));
                j++;
            }
            k++;
        }
        //for any left overs
        while(i <=mid){
            original.set(k,temp.get(i));
            i++;
            k++;
        }
    }
}
