package LeetCode.Easy.TwoPointers;

import java.util.Arrays;

public class StringReverse {

    static String input = "reVerse thIs  stRiNG";
    static String inputSentence = "Let's take LeetCode contest";
    static String pali = "A man, a plan, a canal: Panama";
    static String emp = " ";


    public static void main(String[] args) {
        /*reverseString(input); //#344
        stringToWords(input);
        changePattern();
        toLowerCase(input);
        reverseWords(inputSentence); //#557
        System.out.println(isPalindrome(emp));//#125*/
    }
    static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }
        String nospaces = s.replaceAll("[^a-z0-9A-Z]","").toLowerCase();

        boolean status = false;
        int left = 0;
        int right = nospaces.length()-1;
        while(left < right) {
            if (nospaces.charAt(left) != nospaces.charAt(right)) {
                return false;
            }
                left++;
                right--;
                status = true;
        }
        return status;
    }
    public static String reverseWords(String s) {
        StringBuilder reversedWords = new StringBuilder();
        String[] words = s.split("\\s+");
        for(String word : words){
            reversedWords.append(reverseString(word));
            reversedWords.append(" ");
        }
        return reversedWords.toString().trim();
    }


    static void changePattern(){
        String first = "abcde";
        StringBuilder updated = new StringBuilder();
        for(char ch : first.toCharArray()){
           updated.append((char)(ch+5));
        }
        System.out.println("New Pattern is --> " + updated);
    }
    static void toLowerCase(String str_case){
        String str_new = str_case.replace(" ", "");
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        for(char ch: str_new.toCharArray()){
            //convert all to upper case
            if(ch >= 'a' && ch <= 'z'){
                upper.append((char)(ch-32));
            }else {
                upper.append(ch);
            }
            //convert all to lower case
            if(ch >= 'A' && ch <='Z'){
                lower.append((char)(ch+32));
            }else{
                lower.append(ch);
            }
        }
        System.out.println("Lower case --> "+ lower);
        System.out.println("Upper Case --> "+ upper);
    }
    static void stringToWords(String sentence){
        if(sentence == null || sentence.trim().isEmpty()){
            System.out.println("Empty string.");
            return;
        }

        String[] words = sentence.trim().split("\\s+");
        for(String word :words ){
            System.out.print(word+" "); //print words in order
        }
        System.out.println();
        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i]+ " "); //print the words in reverse order
        }
    }

    static String reverseString(String str){
        //String str_final = str.replace(" ", "");
        //StringBuilder reversed_string = new StringBuilder();
        if(str == null || str.isEmpty()){
            return "Empty String!";
        }
        char[] chars = str.toCharArray();
        int length = chars.length;
            int left = 0;
            int right = length - 1;
            while(left <= right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            return new String(chars);
    }
}
