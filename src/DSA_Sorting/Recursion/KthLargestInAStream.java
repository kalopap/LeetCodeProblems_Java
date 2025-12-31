package DSA_Sorting.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthLargestInAStream {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(4,6));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(5,2,20));
        int k = 2;
        System.out.println("The kth largest list is -> "+findk(listA,listB,k));

    }
    static ArrayList<Integer> findk(ArrayList<Integer> A, ArrayList<Integer> B,int k){
        ArrayList<Integer> mergedList = new ArrayList<>();
        ArrayList<Integer> streamList = new ArrayList<>();

        int m = A.size(); int n = B.size();
        int left = 0;
        int right = m-1;

        while(left <= right){
            mergedList.add(A.get(left));
            left++;
        }
        for(int i = 0; i < n; i++){
            mergedList.add(B.get(i));
            //now sort this newly formed list
            Collections.sort(mergedList);
            streamList.add(mergedList.get(mergedList.size()-k));
        }
         return streamList;
    }

}
