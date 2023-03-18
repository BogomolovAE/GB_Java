package org.example.HW5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HW5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter N (array length): ");
        int N = console.nextInt();
        List arr = new ArrayList();
        for (int i=0;i<N;i++){
            System.out.print("Enter element № "+(i+1)+": ");
            arr.add(console.nextInt());
        }
        int sum=0;
        for (int i=0;i<arr.size();i++){
            if (IsSimple((Integer) arr.get(i))) sum+=(Integer)arr.get(i);
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
