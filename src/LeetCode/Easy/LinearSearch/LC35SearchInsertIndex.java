package LeetCode.Easy.LinearSearch;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the
index where it would be if it were inserted in order.
Input: nums = [1,3,5,6], target = 5
Output: 2
Input: nums = [1,3,5,6], target = 7
Output: 4
 */

public class LC35SearchInsertIndex {

    public static void main(String[] args){
        int[] nums = {1};//{1,3,5,6};
        int search = -1;
        System.out.println(indexSearch(nums,search));
    }

    static int indexSearch(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }

        for(int i = 0; i<=arr.length-1;i++){
            if(arr[i] == target){
                return i;
            }else if(arr[i]>target){
                return i;
            }
        }
        return arr.length;
    }
}
