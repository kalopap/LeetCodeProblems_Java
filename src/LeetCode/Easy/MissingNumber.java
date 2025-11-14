package LeetCode.Easy;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8
 */
public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n=nums.length;
        //Sum of n integers = n*(n+1)/2;
        int expectedSum= n*(n+1)/2;
        int actualSum = 0;
        for(int i:nums){
            actualSum+= i;
        }
        int missingNumber = expectedSum-actualSum;
        System.out.println("The missing number is -> " + missingNumber);
    }
}
