package org.example.Lesson1.HW3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String firstBin = console.nextLine();
        System.out.print("Enter second binary number: ");
        String secondBin = console.nextLine();
        System.out.println("Result= " + DeсToBin(BinToDeс(firstBin.replaceAll("\\s+", "")) + BinToDeс(secondBin.replaceAll("\\s+", ""))));
    }

    public static int BinToDeс(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '1') {
                sum += Math.pow(2, (value.length() - i - 1));
            }
        }
        return sum;
    }

    public static String DeсToBin(int value) {
        String reverseValueInBin = "";
        while (value > 1) {
            reverseValueInBin += Integer.toString(value % 2);
            value /= 2;
        }
        reverseValueInBin += Integer.toString(value);
        String valueInBin = "";
        for (int i = reverseValueInBin.length() - 1; i >= 0; i--) {
            valueInBin += Character.toString(reverseValueInBin.charAt(i));
        }
        return valueInBin;
    }


}