package org.example.HW5;
public class HW5 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr=new int[] {1,6,4,3,7,10,11,5,8};
        for (int i=0;i<arr.length;i++){
            if (IsSimple(arr[i])) sum+=arr[i];
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
