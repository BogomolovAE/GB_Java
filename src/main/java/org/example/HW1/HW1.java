package org.example.HW1;
import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.print("Input your string: ");
        String s=console.nextLine();
        String [] formatedS=s.strip().replaceAll("\\s+", " ").split(" ");
        for (int i=formatedS.length-1;i>=0;i--){
            if (i!=0) System.out.print(formatedS[i]+" ");
            else System.out.print(formatedS[i]);
        }
    }
}
