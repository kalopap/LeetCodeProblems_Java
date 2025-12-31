package DSA_Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicInsertSort {

    public static void main(String[] args){
        int[] nums = {8,2,4,9,3,6};
        System.out.println("The sorted array is -> "+ Arrays.toString(insertSortArr(nums)));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(8,2,4,9,3,6));
        System.out.println("Sorted Array List is -> "+ insertSortArrList(nums2));
    }

    static int[] insertSortArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            int temp = arr[i];
            int red = i-1;
            while(red >=0 && arr[red] > temp){
                //shift elements to the right
                arr[red+1] = arr[red];
                red--;
            }
            arr[red+1] = temp;
        }
        return arr;
    }
    static ArrayList<Integer> insertSortArrList(ArrayList<Integer> arr2){
        int n = arr2.size();
        for(int i = 0; i < n; i++){
            int temp = arr2.get(i);
            int red = i-1;
            while(red >=0 && arr2.get(red) > temp){
                arr2.set(red+1,arr2.get(red));
                red--;
            }
            arr2.set(red+1, temp);
        }
        return arr2;
    }
}
