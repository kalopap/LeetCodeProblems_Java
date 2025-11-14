package LeetCode.Easy.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args){
        int[] arrZeroes = {1,0,0,3,12};
        moveZeroes(arrZeroes);
    }

    //2. Move Zeroes # LC283
    public static void moveZeroes(int[] arr){
        /*Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0] */
        if(arr.length == 0){
            System.out.println("Empty array!");
            return;
        }
        int pos = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
