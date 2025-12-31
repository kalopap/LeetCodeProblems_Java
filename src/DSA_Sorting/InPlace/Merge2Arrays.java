package DSA_Sorting.InPlace;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2,4,6,0,0,0));
        System.out.println(merge_one_into_another(arr1,arr2));

    }
    static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Write your code here.
        int p1 = first.size()-1;
        int p2 = first.size()-1;
        int p  = second.size()-1;

        while(p1>=0 && p2 >=0 && p1 < first.size() && p2 < first.size()){
            if(first.get(p1) > second.get(p2)){ //p1 has bigger
                second.set(p, first.get(p1));
                p1--;
            }else { //if first(p1) < second(p2), p2 has bigger
                second.set(p,second.get(p2));
                p2--;
            }
            p--;
        }
        //any of the array may have left overs, mostly the first one since the second one would already have been sort
        while(p1 >=0 && p1 < first.size()){
            second.set(p,first.get(p1));
            p1--;
            p--;
        }

        return second;
    }
}
