package LeetCode.Easy;
/*
Given a list of meeting intervals where each interval consists of a start and an end time, check if a person can attend
all the given meetings such that only one meeting can be attended at a time.
{[1,5],[5,8],[10,15]} -> 1(yes)
{[1,5],[4,8]} -> 0(no)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AttendMeetings {
    public static void main(String[] args){
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,5));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(5,8));
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(10,15));

        ArrayList<ArrayList<Integer>> given = new ArrayList<>();
        given.add(nums1);
        given.add(nums2);
        given.add(nums3);
        Integer result = can_attend_all_meetings(given);
        System.out.println(result);

    }
    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        intervals.sort(Comparator.comparingInt(a -> a.get(0)));
        int status = 0;
        for(int i = 1; i < intervals.size(); i++){
            int minIntvl = intervals.get(i-1).get(1);
            int maxIntvl = intervals.get(i).get(0);
            status+= (minIntvl <= maxIntvl) ? 1:0;
        }
        if(status == intervals.size()-1)
            return 1;
        else
            return 0;
    }
}
