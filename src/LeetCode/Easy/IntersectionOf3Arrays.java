package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOf3Arrays {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2,5,10));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2,3,4,10));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(2,4,10));
        System.out.println(find_intersection(arr1,arr2,arr3));
    }

    static ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        //initialize 3 pointers
        int p1=0, p2 = 0, p3 = 0;

        while(p1 < arr1.size() && p2 < arr2.size() && p3 < arr3.size()){
            //if all elements at the current indexes are equal, add to result
            if(arr1.get(p1).equals(arr2.get(p2)) && arr2.get(p2).equals(arr2.get(p3))){
                result.add(arr1.get(p1));
                p1++;
                p2++;
                p3++;
            }else{
                int min = Math.min(arr1.get(p1), arr2.get(p2));
                min = Math.min(arr3.get(p3), min);
                if(arr1.get(p1) == min){
                    p1++;
                }else if(arr2.get(p2) == min){
                    p2++;
                }else{
                    p3++;
                }
            }

        }
        if(result.isEmpty()){
            result.add(-1);
        }

        return result;
    }

}
