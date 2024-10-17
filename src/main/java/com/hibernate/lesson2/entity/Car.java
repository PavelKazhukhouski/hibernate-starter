package com.hibernate.lesson2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cars")

public class Car {
    @Id
    private int id;
    private String name;
    private int year;
    private String color;
    private int price;
    private double speed;


}
