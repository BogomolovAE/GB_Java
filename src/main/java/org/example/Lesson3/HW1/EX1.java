package org.example.Lesson3.HW1;

import org.example.Lesson3.HW1.model.Goods;

import java.awt.image.DataBufferDouble;
import java.util.ArrayList;
import java.util.List;
public class EX1 {
    public static void main(String[] args) {
        Goods good1=new Goods("good1 высший","first",13.56);
        Goods good2=new Goods("good2 высший","second",14.56);
        Goods good3=new Goods("good3","third",56.56);
        Goods good4=new Goods("good4","first",20.56);
        Goods good5=new Goods("good5 высший","second",8.56);
        Goods good6=new Goods("good6","third",2.56);
        Goods good7=new Goods("good7 высший","first",5.56);
        Goods good8=new Goods("good8 высший","first",7.56);
        List<Goods> goodsList= new ArrayList<>();
        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
        goodsList.add(good4);
        goodsList.add(good5);
        goodsList.add(good6);
        goodsList.add(good7);
        goodsList.add(good8);
        System.out.println( "max price = "+MaxPrice(goodsList));
    }
    public static  Double MaxPrice (List<Goods> goodsList){
        Double maxPrice= goodsList.get(0).getPrice();
        for (int i=0;i<goodsList.size();i++){
            if (Double.compare(goodsList.get(i).getPrice(),maxPrice)>0&&
               (goodsList.get(i).getCategory()=="first"||
                goodsList.get(i).getCategory()=="second")&&
                goodsList.get(i).getName().contains("высший")){
                    maxPrice=goodsList.get(i).getPrice();
            }
        }
        return maxPrice;
    }
}
