package DSA.BinarySearch;

public class BasicBinSearch {
    public static void main(String[] args) {
        int[] nums = {2,5,8,9,12,13,18,21,25,28,31};
        int index = bSearch(nums,22);
        if(index != -1){
            System.out.println("Element is found at the index -> "+ index);
        }else{
            System.out.println("Element not found!");
        }

    }
    static int bSearch(int[] A, int target){
        //first find the  mid
        int start = 0;
        int end = A.length-1;


        while(start <=end){
            int mid = start + (end-start)/2;
            if(A[mid] == target){
                return mid;
            }else if(target < A[mid]){
                //target is in the left half of the array
                end = mid-1;
            }
            else{
                //target is in the right half of the array
                start = mid+1;
            }
        }
        return -1;

    }
}
