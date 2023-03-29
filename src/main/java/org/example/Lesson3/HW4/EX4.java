package org.example.Lesson3.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX4 {
    public static void main(String[] args) {
        String [] originalArr= new String [] {"A","B","C","D"};
        List <String []> combinationList = new ArrayList<>();
        CombinationGeneration(originalArr,originalArr.length,combinationList);
        for (int i=0;i<combinationList.size();i++){
            System.out.println(Arrays.toString(combinationList.get(i)));
        }

        }
        public static void CombinationGeneration (String[] array, int k,List<String []> combinationList){
        if ((k==1)&&(IsUnique(combinationList,array))){
            combinationList.add(new String[array.length]);
            CopyArray(combinationList.get(combinationList.size()-1),array);
            return;
        }
        for (int i=0;i<k;i++){
            CombinationGeneration(array,k-1,combinationList);
            String temp=array[k-1];
            if (k%2==0){
                array[k-1]=array[i];
                array[i]=temp;
            }
            else{
                array[k-1]=array[0];
                array[0]=temp;

            }

            }

        }
        public static void CopyArray (String[] newArr,String[] oldArr){
            for (int i=0;i<newArr.length;i++){
             newArr[i]=oldArr[i];
            }
        }
        public static boolean IsUnique (List<String[]> combinationList, String[] array){
        for (int i=0;i<combinationList.size();i++){
            if (Arrays.equals(combinationList.get(i),array)) {
                return false;
            }
        }
        return true;
        }
}
