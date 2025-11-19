package LeetCode.Easy.LinearSearch;
/*1346. Check If N and Its Double Exist
Given an array arr of integers, check if there exist two indices i and j such that :
i != j, 0 <= i, j < arr.length, arr[i] == 2 * arr[j]
Input: arr = [10,2,5,3]; Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */
public class LC1346_DoubleAndN {
    public static void main(String[] args){
        int[] nums = {7,1,14,2};
        System.out.println("If double exists -> " + checkIfExist(nums));

    }
    public static boolean checkIfExist(int[] arr) {
        boolean exists = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i!=j && arr[i] == arr[j]*2){
                    exists = true;
                }
            }
        }
        return exists;
    }
}
