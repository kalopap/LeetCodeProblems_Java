package LeetCode.Easy.TwoPointers;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RemoveDupsFromSortedArray {

    public static void main(String[] args){
        //int[] a = {12,13,14,14,21,21};
        int[] a = {1,1,2};
        replaceDups(a);
    }

    static int replaceDups(int[] arr){
        /*
        1.run through loop, add ele to hashmap, if ele exists, count, separate all unique nums
        and add to new array of same length from hashmap. replace left over spaces with _
         */
        int[] new_arr = new int[arr.length];

        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){ //if number already exists, increase count
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
       //adding the keys(unique numbers) to a new array
        ArrayList<Integer> new_list = new ArrayList<>(hm.keySet());
        System.out.println(new_list);

        return new_list.size();

    }
}
