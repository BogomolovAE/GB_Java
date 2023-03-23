package org.example.Lesson2.HW1;
import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter N (array length): ");
        int N = console.nextInt();
        int sum=0;
        for (int i=0;i<N;i++){
            System.out.print("Enter element № "+(i+1)+": ");
            int currentElement=console.nextInt();
            if (IsSimple(currentElement)) sum+=currentElement;
        }
        System.out.println("Result = "+sum);
    }
    public static Boolean IsSimple(int num){
        num=Math.abs(num);
        if (num==1||num==0) return false;
        else {
        }
        for (int i=2;i<num;i++){
            if (num%i==0) return false;
        }
        return true;
    }
}
