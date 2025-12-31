package DSA_Sorting.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicBublSort {
    public static void main(String[] args){
        int[] nums = {2,4,10,6,9,5,1,8,3,7};
        System.out.println("The sorted array is -> "+ Arrays.toString(bubbleSort(nums)));
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(2,4,10,6,9,5,1,8,3,7));
        System.out.println(bubblSort(numsList));
    }
    static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 1; j < n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    static ArrayList<Integer> bubblSort(ArrayList<Integer> num){
        int n = num.size();
        for(int i = 0; i < n-1; i++){
            for(int j = 1; j < n-i; j++){
                if(num.get(j) < num.get(j-1)){
                    int temp = num.get(j);
                    num.set(j, num.get(j-1));
                    num.set(j-1, temp);
                }
            }
        }
        return num;
    }
}

