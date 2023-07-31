package com.example.demo5.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "tb_product")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Double weight;
    Boolean isAvailable;
    @ManyToOne
    @JoinColumn(name = "tb_category_id")
    Category category;
    @ManyToOne
    @JoinColumn(name = "basket_id",referencedColumnName = "id")
    private Basket basket;

}
