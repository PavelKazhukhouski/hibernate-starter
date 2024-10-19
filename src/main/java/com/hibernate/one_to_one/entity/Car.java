package com.hibernate.one_to_one.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;

    @Column(name = "speed")
    private double speed;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    @ToString.Exclude
    private Engine engine;
}
