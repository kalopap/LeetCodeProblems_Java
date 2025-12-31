package DSA_Sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(5,2,10,9,1,8,5,6,3,7,4));
        System.out.println("The sorted list is -> " + mergeSort(nums1));
    }

    static ArrayList<Integer> mergeSort(ArrayList<Integer> input){
        if(input.size() == 1){
            return input;
        }
        int mid = input.size()/2;
        //Divide the list into two halves

        //sort the two halves by recursively calling mergeSort
        ArrayList<Integer> left = mergeSort(new ArrayList<Integer>(input.subList(0,mid)));
        ArrayList<Integer> right = mergeSort(new ArrayList<>(input.subList(mid,input.size())));

        //now merge back both the halves
        return merge(left, right);
    }
    static ArrayList<Integer> merge(ArrayList<Integer> leftHalf, ArrayList<Integer> rightHalf){

        ArrayList<Integer> mergedList = new ArrayList<>();

        int i = 0, j=0, k=0;
        //sort and merge
        while(i < leftHalf.size() && j < rightHalf.size()) {
            if (leftHalf.get(i) <= rightHalf.get(j)) {
                mergedList.add(k, leftHalf.get(i));
                i++;
            } else {
                mergedList.add(k, rightHalf.get(j));
                j++;
            }
            k++;
        }
        while(i < leftHalf.size()){
            mergedList.add(k,leftHalf.get(i));
            i++;
            k++;
        }
        while(j < rightHalf.size()){
            mergedList.add(k, rightHalf.get(j));
            j++;
            k++;
        }
        return mergedList;
    }
}

