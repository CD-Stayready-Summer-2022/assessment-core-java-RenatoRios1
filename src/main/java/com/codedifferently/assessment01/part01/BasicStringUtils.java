package com.codedifferently.assessment01.part01;

import java.util.ArrayList;
import java.util.Locale;

import static com.codedifferently.assessment01.part01.StringUtils.getWords;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        ArrayList<String> words = new ArrayList<>();
        //Append characters to tempStr until ' ' is encountered at which point save tempStr as an Element in words ArrayList
        String tempStr = "";
        for(int i = 0; i < str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                tempStr += str.charAt(i);
            }
            if(str.charAt(i) == ' ') {
                words.add(tempStr);
                tempStr = "";
            }
        }
        words.add(tempStr); //Always add last word

        String outputStr = "";
        for(int i = 0; i < words.size(); i++){
            String temporary = words.get(i).toLowerCase(Locale.ROOT);
            outputStr += Character.toUpperCase(temporary.charAt(0)) + temporary.substring(1,temporary.length());
        }
        return outputStr;
    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        String[] words = getWords(str);
        //reverse
        for(int i = 0; i < words.length; i++){
            String temp = reverse(words[i]);
            words[i] = temp;
        }
        //camelCase
        for(int i = 0; i < words.length; i++){
            String temp = camelCase(words[i]);
            words[i] = temp;
        }
        //Format String output
        String output = "" ;
        for(int i = words.length-1; i >= 0; i--){
            output += words[i];
        }
        return output;
    }

    public static String removeFirstAndLastCharacter(String str){
        return  new StringBuilder(str).substring(1, str.length()-1);
    }
}
