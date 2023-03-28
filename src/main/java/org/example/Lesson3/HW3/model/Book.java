package org.example.Lesson3.HW3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Book {
    String name;
    String authorSurname;
    Double price;
    Integer year;
    Integer length;
}
