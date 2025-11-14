package LeetCode.Easy;

import java.util.HashMap;

/*
"listen" and "silent" → ✅ anagrams
"race" and "care" → ✅ anagrams
"triangle" and "integral" → ✅ anagrams
❌ Not Anagrams:
"hello" and "bello" → ❌ different letters
"test" and "ttew" → ❌ same length, but w is not in "test"
 */
public class IsAnagram {

    public static void main(String[] args){
        String str1 = "a gentleman";
        String str2 = "elegant man";

        if(isAnagram(str1,str2)){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("The strings are NOT anagrams");
        }

        //String array anagram check
        String[] expected = {"name","age","gender"};
        String[] actual = {"age","gender","name"};
        if(isAnagram(expected,actual)){
            System.out.println("The expected and actual results match");
        }else{
            System.out.println("Expected is not equal to actual result");
        }
    }

    public static HashMap<Character, Integer> getCharacterCount(String str){
        str = str.replaceAll("\\s","").toLowerCase();

        char[] char_arr = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:char_arr){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        return hm;
    }
    public static HashMap<String,Integer> getWordCount(String[] str_arr){

        HashMap<String,Integer> hmS = new HashMap<>();
        for(String word : str_arr){
            if(hmS.containsKey(word)){
                hmS.put(word,hmS.get(word)+1);
            }else{
                hmS.put(word,1);
            }
        }
        return hmS;
    }

    public static boolean isAnagram(String str1,String str2){

        HashMap<Character,Integer> map1 = getCharacterCount(str1);
        HashMap<Character,Integer> map2 = getCharacterCount(str2);

        return map1.equals(map2);
    }
    public static boolean isAnagram(String[] str_arr1,String[] str_arr2){
        HashMap<String,Integer> map1 = getWordCount(str_arr1);
        HashMap<String,Integer> map2 = getWordCount(str_arr2);
        return map1.equals(map2);

    }
}
