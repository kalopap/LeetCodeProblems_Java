package DSA_Sorting.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

/* Given: An array (or list) of n numbers, An integer k (1 ≤ k ≤ n)
Task: Return the element that would be in the k-th position if the array were sorted in ascending order.
Example 1:
Input: arr = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
 */
public class KthSmallestEle {

    public static void main(String[] args){
        ArrayList<Integer> listN1 = new ArrayList<>(Arrays.asList(7,10,4,3,20,15));
        ArrayList<Integer> listN2 = new ArrayList<>(Arrays.asList(7,10,4,3,20,15));
        System.out.println("The Kth element is -> "+ selSortTillK(listN1,1));
        System.out.println("The Kth element is -> "+ selSortTillK(listN2,6));

    }

    static int selSortTillK(ArrayList<Integer> arr, int k){
        int n = arr.size();

        for(int i = 0; i <= k-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n;j++){
                if(arr.get(j) < arr.get(minIndex)){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
        return arr.get(k-1);
    }
}
