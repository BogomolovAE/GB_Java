package org.example.Lesson3.HW3;

import org.example.Lesson3.HW3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class EX3 {
    public static void main(String[] args) {
        String searchingSymbol="A";
        Integer yearFilter=2010;
        int counter=1;
        Book book1=new Book("Book1","Author Surname1",65.1,2005,700);
        Book book2=new Book("Book2","Author Surname2",615.21,2010,347);
        Book book3=new Book("Book3","Author Surname3",635.14,2001,64);
        Book book4=new Book("Book4","Author Surname4",625.1,2007,234);
        Book book5=new Book("Book5","Author Surname5",165.41,2002,51);
        Book book6=new Book("Book6","Author Surname6",665.12,2011,11);
        Book book7=new Book("Book7","Author Surname7",765.81,2019,641);
        Book book8=new Book("Book8","Author Surname8",625.18,1999,812);
        Book book9=new Book("Book9","Author Surname9",615.14,1967,2345);
        Book book10=new Book("Book10","Author Surname10",165.21,1988,612);
        Book book11=new Book("Book11","Author Surname11",165.16,2005,754);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);
        bookList.add(book11);
       for (int i=0;i< bookList.size();i++){
           if (bookList.get(i).getAuthorSurname().contains(searchingSymbol)&&
               IsSimple(bookList.get(i).getLength())&&
               Integer.compare(yearFilter,bookList.get(i).getYear())<=0){
               System.out.println((counter++)+". "+bookList.get(i).getName());
           }
       }
    }
    public static Boolean IsSimple(Integer num){
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
