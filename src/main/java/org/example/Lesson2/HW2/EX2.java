package org.example.Lesson2.HW2;

import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter N (array length): ");
        boolean isIncreasing=true;
        int N = console.nextInt();
        System.out.print("Enter element № "+1+": ");
        int a=console.nextInt();
        for (int i=0;i<N-1;i++){
            System.out.print("Enter element № "+(i+2)+": ");
            int b=console.nextInt();
            if (a>b) isIncreasing=false;
            a=b;
        }
        if (isIncreasing)  System.out.println("array is increasing: ");
        else System.out.println("array is NOT increasing: ");
    }
}
