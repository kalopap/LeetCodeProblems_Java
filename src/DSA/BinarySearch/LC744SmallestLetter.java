package DSA.BinarySearch;

public class LC744SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a','b','d','f','h','j','l','n','o','z'};
        System.out.println(letterGreaterThanTarget(letters,'z'));
    }
    static char letterGreaterThanTarget(char[] A, char target){
        int n = A.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
             int mid = start + (end-start)/2;
             if(target < A[mid]){
                 end = mid-1;

            }else{ //target >= A[mid]
                 start = mid+1;
            }
        }
        return A[start%n];
    }

}
