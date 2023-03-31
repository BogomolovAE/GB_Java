package org.example.Lesson5.HW1;

import java.util.HashMap;
import java.util.Map;

public class Cw1 {
    public static void main(String[] args) {
        String textToAnalyze="Россия идет вперед всей планеты. Планета — это не Россия.";
        String [] parsedText=  TextConvertation(textToAnalyze).split(" ");
        System.out.println(FillDict(parsedText));
    }


    public static String TextConvertation (String textToAnalyze){
    String s="";
        for (int i=0;i<textToAnalyze.length();i++){
        if (Character.isLetter(textToAnalyze.charAt(i))||
            Character.isDigit(textToAnalyze.charAt(i))||
            textToAnalyze.charAt(i) ==' ')
        {
            s+=Character.toString(textToAnalyze.charAt(i));
        }
        else {
            s+=Character.toString(' ');
        }
    }
        s= s.replaceAll("\\s+", " ").toLowerCase();
        return s;
    }


    public static Map <String,Integer> FillDict (String [] text) {
        Map <String,Integer>dictionary=new HashMap<>();
        for (int i=0;i<text.length;i++){
            if (dictionary.containsKey(text[i])){
                dictionary.put(text[i], dictionary.get(text[i]) + 1);
            }
            else {
                dictionary.put(text[i],1);
            }
        }
        return dictionary;
    }
}
