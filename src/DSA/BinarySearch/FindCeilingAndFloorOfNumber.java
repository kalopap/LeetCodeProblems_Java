package DSA.BinarySearch;
/*
Given an array, find the ceiling of a given element
 */

public class FindCeilingAndFloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,8,9,14,16,18,20};
        int ceiling = findCeilingAndFloor(nums,17);
        System.out.println("The ceiling of the number is -> " + ceiling);
    }
    static int findCeilingAndFloor(int[] A, int target){
        //find the mid element
        int start = 0;
        int end = A.length-1;
        int[] result = new int[2];


        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == A[mid]){
                return A[mid];
            }else if(target > A[mid]){
                start = mid+1;
            }else{ //target < A[mid]
                end = mid-1;
            }
        }
        return A[end];
    }

}
