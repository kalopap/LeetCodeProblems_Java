package LeetCode.Easy.TwoPointers;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
number sorted in non-decreasing order.
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]
 */
public class SquaresOfSortedArray {

    public static void main(String[] args){
        int[] num = {-7,-3,2,3,11};
        sortedSquares(num);
        //squareNumberSort(num);
    }
    //this is hard way- brute force
    static void squareNumberSort(int[] nums){
        int left = 0, right = nums.length-1;
        while(left < right){
            nums[left]*= nums[left];
            nums[right]*= nums[right];
            left++;
            right--;
        }

        System.out.println("Array before sorting -> " + Arrays.toString(nums));
        bubbleSort(nums);
        //Arrays.sort(nums);
        System.out.println("Array after sorting -> " + Arrays.toString(nums));
    }

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //simpler way of sorting and squaring in one loop
    static void sortedSquares(int[] num){
        int n = num.length;
        int[] result = new int[n];
        int left = 0, right = n-1, pos = n-1;
        while(left <= right){
            int leftSq = num[left]*num[left];
            int rightSq = num[right]*num[right];
            if(leftSq > rightSq){
                result[pos] = leftSq;
                left++;
            }else{
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        System.out.println(Arrays.toString(result));
    }

}
