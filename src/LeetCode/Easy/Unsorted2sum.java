package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Unsorted2sum {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 10, 45, 1));
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        int target = 6;
        for(int i = 0; i < numbers.size(); i++){
            int n1 = numbers.get(i);
            int n2 = target - n1;
            if(hm.containsKey(n2)){
                result.add(i);
                result.add(hm.get(n2));
                System.out.println(result);
                break;
            }else{
                hm.put(n1,i);
            }
        }
        //if no pair found
        result.add(-1);
        result.add(-1);
        System.out.println(result);
    }
}
