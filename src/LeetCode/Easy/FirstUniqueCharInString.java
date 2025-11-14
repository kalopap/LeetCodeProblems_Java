package LeetCode.Easy;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
 */
public class FirstUniqueCharInString {

    public static void main(String[] args){
        String s = "kakakakag";
        char[] char_arr = s.toCharArray();
        LinkedHashMap<Character,Integer> linkMap = new LinkedHashMap<>();
        for(char c:char_arr){
            if(linkMap.containsKey(c)){
                linkMap.put(c,linkMap.get(c)+1);
            }else{
                linkMap.put(c,1);
            }
        }
        for(char c:char_arr){
            if(linkMap.get(c)==1){
                System.out.println("The first unique character is -> "+ c);
                break;
            }
        }
/*        for(Map.Entry<Character,Integer> entry : linkMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println("The first unique character is -> " + entry.getKey());
                break;
            }
        }*/
    }
}
