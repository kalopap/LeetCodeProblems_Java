package DSA_Sorting.InPlace;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given some balls of three colors arranged in a line, rearrange them such that all the red balls go first,
then green and then blue ones.
{
"balls": ["G", "B", "G", "G", "R", "B", "R", "G"]
}
Output:

["R", "R", "G", "G", "G", "G", "B", "B"]
 */
public class DutchNF {
    public static void main(String[] args){
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('G', 'B', 'G', 'G', 'R', 'B', 'R', 'G'));
        System.out.println("Given array is -> "+ input);
        System.out.println("Sorted array is -> "+dutch_flag_sort(input));
    }
    static ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {
        // Write your code here.
        int left = 0;
        int mid = 0;
        int right = balls.size()-1;
        while(mid <= right) {
            switch (balls.get(mid)) {
                case 'B':
                    //swap with the right most element
                    char temp = balls.get(right);
                    balls.set(right, balls.get(mid));
                    balls.set(mid, temp);
                    right--;
                    break;

                case 'G':
                    mid++;
                    break;
                case 'R':
                    //push R to left by swapping it with mid
                    char temp2 = balls.get(left);
                    balls.set(left, balls.get(mid));
                    balls.set(mid, temp2);
                    left++;
                    mid++;
                    break;
            }
        }
        return balls;
    }
}
