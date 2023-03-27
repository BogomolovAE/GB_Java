package org.example.Lesson3.HW2.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Goods {
    String name;
    String country;
    Double weight;
    Double price;
    String category;
}
