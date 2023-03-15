package org.example.HW2;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter integers or zero to complete the input: ");
        int a=console.nextInt();
        int sum=0;
        while (a!=0){
            int b=console.nextInt();
            if ((a>0)&&(b<0))sum+=a;
            a=b;
        }
        System.out.println("Result: "+sum);
    }
}
