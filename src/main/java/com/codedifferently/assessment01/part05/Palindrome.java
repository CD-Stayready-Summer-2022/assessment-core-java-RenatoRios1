package com.codedifferently.assessment01.part05;

import java.util.ArrayList;

public class Palindrome {
    public Integer countPalindromes(String input){
        ArrayList<String> substringsFound = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            for(int j = 0+i; j <= input.length(); j++ ){
                if(isPalindrome(input.substring(i,j))){
                    substringsFound.add(input.substring(i,j));
                    count++;
                }
            }
        }
        return count;
    }

    public Boolean isPalindrome(String str){
        String tempStr = new StringBuilder(str).reverse().toString();
        if(str != "" && tempStr != "" && str.equals(tempStr)){
            System.out.println(tempStr + " " + str);
            return true;
        }
        return false;
    }
}
