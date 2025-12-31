package DSA_Sorting.InPlace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {
    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 3, -4, 1, -6, 9));
        find_zero_sum(input);


    }
    static ArrayList<String> find_zero_sum(ArrayList<Integer> arr) {
        // Write your code here.
        ArrayList<String> result = new ArrayList<>();
        int n = arr.size();
        //presort

        Collections.sort(arr);

        //decrease and conquer to 2-sum
        for(int i = 0; i < n; i++){
            int a = arr.get(i);
            int target = -a;
            int left = 0; int right = n-1;
            while(left < right){
                int sum = arr.get(left) + arr.get(right);
            }

        }

        return result;
    }
}
