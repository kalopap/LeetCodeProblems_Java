package DSA_Sorting.SelectionSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args){
        int[] nums = {3,10,4,7,20,15};
        System.out.println("The smallest element and the second smallest element are -> "+ findSecondSmallest(nums));

    }
    static ArrayList<Integer> findSecondSmallest(int[] arr){
        int n = arr.length;
        ArrayList<Integer> smallest = new ArrayList<>();
        for(int i = 0; i <= 1; i++){
            int minIndex = i;
            for(int j= i+1; j < n; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            smallest.add(arr[i]);
        }
        return smallest;
    }
}
