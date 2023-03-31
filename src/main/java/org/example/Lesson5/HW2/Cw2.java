package org.example.Lesson5.HW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cw2 {
    public static void main(String[] args) {
        String textToAnalyze="      Россия идет вперед всей планеты. Планета — это не Россия.       "  ;
        String [] parsedText=  TextConvertation(textToAnalyze).split(" ");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = console.next();
        System.out.println("The word «"+word+"» (case-insensitive) occurs in the text: «"+textToAnalyze.strip()+"»");
        word=TextConvertation(word);
        Integer quantity = RepetitionCounter(parsedText,word).get(word);
        System.out.println(quantity + ((quantity>1)? " times ":" time"));
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
        s= s.replaceAll("\\s+", " ").toLowerCase().strip();
        return s;
    }


    public static Map<String,Integer> RepetitionCounter (String [] text,String word) {
        Map <String,Integer>dictionary=new HashMap<>();
        dictionary.put(word,0);
        for (int i=0;i<text.length;i++){
            if (dictionary.containsKey(text[i])){
                dictionary.put(text[i], dictionary.get(text[i]) + 1);
            }
        }
        return dictionary;
    }
}
