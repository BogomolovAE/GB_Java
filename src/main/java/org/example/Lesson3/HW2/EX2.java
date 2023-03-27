package org.example.Lesson3.HW2;

import org.example.Lesson3.HW2.model.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Goods good1 = new Goods("Good1","Russia",2.24,1.43,"First");
        Goods good2 = new Goods("Good2","China",5.24,1.43,"Second");
        Goods good3 = new Goods("Good3","England",7.24,1.43,"First");
        Goods good4 = new Goods("Good4","USA",2.24,3.43,"First");
        Goods good5 = new Goods("Good5","Brasil",3.24,5.43,"Second");
        Goods good6 = new Goods("Good6","Argentina",1.24,6.43,"First");
        Goods good7 = new Goods("Good7","Italy",6.24,8.43,"Second");
        Goods good8 = new Goods("Good8","Russia",26.24,1.43,"Second");
        Goods good9 = new Goods("Good9","Japan",12.24,1.43,"First");
        Goods good10 = new Goods("Good10","Korea",211.24,62.43,"First");
        List<Goods> goodsList= new ArrayList<>();
        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
        goodsList.add(good4);
        goodsList.add(good5);
        goodsList.add(good6);
        goodsList.add(good7);
        goodsList.add(good8);
        goodsList.add(good9);
        goodsList.add(good10);
        Scanner console=new Scanner(System.in);
        System.out.print("Input name of Category: ");
        String category=console.nextLine();
        Double minPrice=MinPrice(goodsList,category);
        int counter=1;
        for (int i=0;i<goodsList.size();i++){
            if (Double.compare(goodsList.get(i).getPrice(),minPrice)==0&&
                goodsList.get(i).getCategory().equals(category)){
                System.out.println((counter++)+". "+goodsList.get(i).getName());
            }
        }
    }
    public static  Double MinPrice (List<Goods> goodsList,String category){

        Double minPrice= -1.0;
        for (int i=0;i<goodsList.size();i++) {
            if (goodsList.get(i).getCategory().equals(category)) {
                if (minPrice == -1.0) minPrice = goodsList.get(i).getPrice();
                else if (Double.compare(goodsList.get(i).getPrice(), minPrice) < 0) {
                    minPrice = goodsList.get(i).getPrice();
                }
            }
        }
        return minPrice;
    }
}
