package LeetCode.Easy.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNOdd {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(11,3,1,2,3,-8,-9,5,6,10,12,-1));
        System.out.println(segregate_evens_and_odds(nums));

    }
    static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
        //using two pointer approach
        int left = 0;
        int right = numbers.size()-1;

        while(left < right){


            while(left <right && numbers.get(left)%2 ==0){
                left++;
            }
            while(right > left && (numbers.get(right)%2 == 1 || numbers.get(right)%2 == -1)){
                right--;
            }
            if(numbers.get(left)%2 == 1 || numbers.get(right)%2 == 0){
                //swap left and right
                int temp = numbers.get(left);
                numbers.set(left, numbers.get(right));
                numbers.set(right, temp );
                left++;
                right--;
            }
        }

        return numbers;
    }
}
