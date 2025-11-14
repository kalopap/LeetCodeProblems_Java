package LeetCode.Easy.LinearSearch;

import java.util.ArrayList;
import java.util.List;

/*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a
rule represented by two strings, ruleKey and ruleValue.
Example 2:
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */
public class LC1773_RuleMatching {
    public static void main(String[] args){
        List<String> itemList1 = new ArrayList<>();
        itemList1.add("phone");
        itemList1.add("blue");
        itemList1.add("pixel");
        List<String> itemList2 = new ArrayList<>();
        itemList2.add("computer");
        itemList2.add("silver");
        itemList2.add("phone");
        List<String> itemList3 = new ArrayList<>();
        itemList3.add("phone");
        itemList3.add("gold");
        itemList3.add("iphone");
        List<List<String>> allItemList = new ArrayList<>();
        allItemList.add(itemList1);
        allItemList.add(itemList2);
        allItemList.add(itemList3);
        System.out.println(allItemList.toString());
        int matchCount = enhancedCountMatch(allItemList,"color","silver");
        //int matchCount = countMatches(allItemList,"color","silver");
        System.out.println("Count is -> "+ matchCount);
    }

    public static int enhancedCountMatch(List<List<String>> items, String ruleKey, String ruleValue){
        int counter = 0;
        int column = switch(ruleKey){
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> throw new IllegalArgumentException("Invalid ruleKey");
        };

        for(List<String> item : items){
            if(item.get(column).equals(ruleValue)){
                counter++;
            }
        }
        return counter;
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int column = -1;
        String element;

        switch(ruleKey){
            case "type":
                column = 0;
                    break;
            case "color":
                column = 1;
                    break;
            case "name":
                column = 2;
                break;
        }
        for(int row = 0; row < items.size();row++){
            element = items.get(row).get(column);
            if(element.equals(ruleValue)){
                System.out.println("The element '" +ruleValue+  "' is found at -> ["+ row + ", " + column + "]");
                count++;
            }
        }
        return count;
    }
}


