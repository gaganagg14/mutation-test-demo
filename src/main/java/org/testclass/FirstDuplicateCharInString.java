package org.testclass;

import java.util.HashSet;

public class FirstDuplicateCharInString {

    public Character firstDupChar(String str){
        if(str.length()==0 || str == null ){
            return null;
        }
        HashSet<Character> charPresent = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(charPresent.contains(ch)){
                return ch;
            }
            charPresent.add(ch);
        }
        return null;
    }
}
