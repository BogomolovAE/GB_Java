package org.example.Lesson4.HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Ex2 {
    public static void main(String[] args) {

        String s = "asdfasdfafgsdfgh[]f(sadfas[sdf])sdf{sdfsdfghdfgh{sdfgdfgh}sdghsdfgh}";
        System.out.println(StringValidator(s));
        }
    public static boolean StringValidator (String s){
        ArrayList<Character> openingBrackets = new ArrayList<>(Arrays.asList('[','{','('));
        ArrayList<Character> closingBrackets = new ArrayList<>(Arrays.asList(']','}',')'));
        LinkedList<Character> sequenceOfBrackets=new LinkedList<>();
        for (int i=0;i<s.length();i++){
            if (openingBrackets.contains(s.charAt(i))){
                sequenceOfBrackets.addLast(s.charAt(i));
            } else if (closingBrackets.contains(s.charAt(i))) {
                if (sequenceOfBrackets.size()==0) return false;
                if (openingBrackets.indexOf(sequenceOfBrackets.getLast())==closingBrackets.indexOf(s.charAt(i))){
                    sequenceOfBrackets.removeLast();
                }
                else return false;
            }
    }
        if (sequenceOfBrackets.size()==0) return true;
        else return false;
}
}