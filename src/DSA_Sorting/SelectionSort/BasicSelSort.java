package DSA_Sorting.SelectionSort;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

/* Selection Sort 'selects' min element from remaining array elements and swaps with the current kth position
 */
public class BasicSelSort {
    public static void main(String[] args){
        int[] arr1 = {2,5,1,6,3,4};
        int[] arr2 = {2,5,1,6,3,4};
        System.out.println("Selection sort numbers ascending order is -> "+ Arrays.toString(selSortAsc(arr1)));
        System.out.println("Selection sort numbers in descending order is -> " + Arrays.toString(selSortDesc(arr2)));
        String one = "hxeothslafcu";
        String two = "hxeothslafcu";
        System.out.println("The sorted string by character ascending is -> " + selSortCharAsc(one));
        System.out.println("The sorted string by character descending is -> " + selSortCharDesc(two));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(5,8,3,9,4,1,7));
        System.out.println("Output -> "+ selection_sort(arr3));

    }
    static int[] selSortAsc(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n ; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            //swap the i element with minIndex ele
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    //selction sort numbers in descending order
    static int[] selSortDesc(int[] numbers){
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            int maxIndex = i;
            for(int j = i+1; j < n; j++){
                if(numbers[j] > numbers[maxIndex]){
                    maxIndex = j;
                }
            }
            //swap ith element with maxIndex ele
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;
        }
        return numbers;
    }

    //selction sort for characters ascending
    static String selSortCharAsc(String word){
        char[] letters = word.toCharArray();
        int n = letters.length;
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(letters[j] < letters[minIndex]){
                    minIndex = j;
                }
            }
            //swap chars
            char temp = letters[i];
            letters[i] = letters[minIndex];
            letters[minIndex] = temp;
        }

        return new String(letters);
    }
    //Selction Sort for strings descending characters
    static String selSortCharDesc(String word){
        char[] letters = word.toCharArray();
        int n = letters.length;
        for(int i = 0; i < n; i++){
            int maxIndex = i;
            for(int j = i+1; j < n; j++){
                if(letters[j] > letters[maxIndex]){
                    maxIndex = j;
                }
            }
            //swap
            char temp = letters[i];
            letters[i] = letters[maxIndex];
            letters[maxIndex] = temp;

        }

        return new String(letters);
    }

    static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {
        // Write your code here.
        int n = arr.size();
        for(int i = 0; i < n ; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr.get(j) < arr.get(minIndex)){
                    minIndex = j;
                }
            }
            //swap min number with position i element
            int temp = arr.get(i);
            arr.set(i,arr.get(minIndex));
            arr.set(minIndex, temp);

        }
        return arr;
    }


}
