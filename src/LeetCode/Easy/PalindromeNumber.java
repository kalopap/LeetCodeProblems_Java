package LeetCode.Easy;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121, Output: true
 */
public class PalindromeNumber {
    public static void main(String args[]){
        int x = 12121;
        int originalNum = x;
        int rem=0;
        while(x!=0) {
            rem= rem*10 + x%10;
            x = x/10;
        }

        if(rem == originalNum){
            System.out.println("The given number is a Palindrome");
        }else{
            System.out.println("The given number is Not a Palindrome");
        }

    }
}
