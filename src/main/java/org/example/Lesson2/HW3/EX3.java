package org.example.Lesson2.HW3;
public class EX3 {
    public static void main(String[] args) {
        int [] arr = new int[] {2,-23,6,-55,8};
        System.out.print("Result = { ");
        for (int i=0;i<arr.length;i++){
        if (arr[i]<0) arr[i]=Math.abs(arr[i]/10+arr[i]%10);
        System.out.print(arr[i]+" ");
        }
        System.out.println("}");
    }
}
