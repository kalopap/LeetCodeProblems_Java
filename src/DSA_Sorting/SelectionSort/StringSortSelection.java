package DSA_Sorting.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSortSelection {
    public static void main(String[] args){
        ArrayList<String> nameSets = new ArrayList<>(Arrays.asList("zebra","elephant","dog", "mouse","apple","fish", "cat", "goat"));
        System.out.println("The names sorted in alphabetical order -> "+ sortAlphabetically(nameSets));

    }
    static ArrayList<String> sortAlphabetically(ArrayList<String> listStrings){
        int n = listStrings.size();
        for(int i = 0; i < n ; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(listStrings.get(j).compareTo(listStrings.get(minIndex)) < 0){
                    minIndex = j;
                }
            }
            //swap
            String temp = listStrings.get(i);
            listStrings.set(i, listStrings.get(minIndex));
            listStrings.set(minIndex, temp);
        }
        return listStrings;
    }
}
