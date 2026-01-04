package DSA.BinarySearch;

import java.util.Arrays;

public class LC34_FirstLastPosOfElement {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5, 5, 5,6,6,7,8,9};
        System.out.println(Arrays.toString(searchRange(A1,10)));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int first = findIndex(nums,target,true);
        int last = findIndex(nums,target,false);
        result[0] = first;
        result[1] = last;
        return result;
    }
    static int findIndex(int[] A, int t, boolean isFirst){
        //find mid
        int start = 0, end = A.length-1;
        int res = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(A[mid] > t){
                end = mid - 1;
            }else if(A[mid] < t){
                start = mid + 1;
            }else{//A[mid] == target
                res = mid;
                if(isFirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return res;
    }
}
