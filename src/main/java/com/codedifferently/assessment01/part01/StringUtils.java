package com.codedifferently.assessment01.part01;

import java.lang.String;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.lang.Character;
import java.util.Locale;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        ArrayList<String> words = new ArrayList<>();
        //Append characters to tempStr until ' ' is encountered at which point save tempStr as an Element in words ArrayList
        String tempStr = "";
        for(int i = 0; i < sentence.length() ; i++) {
            if(Character.isAlphabetic(sentence.charAt(i))){
                tempStr += sentence.charAt(i);
            }
            if(sentence.charAt(i) == ' ') {
                words.add(tempStr);
                tempStr = "";
            }
        }
        words.add(tempStr); //Always add last word

        //Transfer words to string array
        String [] arrStr = new String[words.size()];
        for(int i = 0; i < arrStr.length; i++){
            arrStr[i] = words.get(i);
        }

        return arrStr;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        String tempStr = "";
        for(int i = 0; i < sentence.length() ; i++) {
            if(Character.isAlphabetic(sentence.charAt(i))){
                tempStr += sentence.charAt(i);
            }
            if(sentence.charAt(i) == ' ') {
                break;
            }
        }
        return tempStr;
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        String firstWord = getFirstWord(sentence);
        return new StringBuilder(firstWord).reverse().toString();
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        String firstWord = reverseFirstWord(getFirstWord(sentence));
        firstWord = firstWord.toLowerCase(Locale.ROOT);
        String output = Character.toUpperCase(firstWord.charAt(0)) + firstWord.substring(1,firstWord.length());
        return output;
    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder strBuildr = new StringBuilder(str).deleteCharAt(index);
        return strBuildr.toString();
    }
}
