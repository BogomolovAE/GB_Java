package org.example.Lesson4.HW1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        for (int i=linkList.size()-1;i>=0;i--){
            int temp=linkList.get(i);
            linkList.remove(i);
            linkList.addLast(temp);
        }
        System.out.println(linkList);
    }

}
