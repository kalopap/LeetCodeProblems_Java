package LeetCode.Easy.LinearSearch;
/*268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in
the range that is missing from the array.
 */
public class LC268_MissingNumber {
    public static void main(String[] args){
        int[] nums = {3,0,1};//{9,8,6,4,2,3,5,7,0,1};
        System.out.println("The missing number is -> " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expected_sum = n*(n+1)/2;
        int actual_sum = 0;
        for(int num : nums){
            actual_sum+= num;
        }
        return expected_sum - actual_sum;
    }
}
