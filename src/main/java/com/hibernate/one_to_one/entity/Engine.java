package com.hibernate.one_to_one.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "engine")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "horse_power")
    private int horsePower;

    @Column(name = "volume")
    private int volume;
    @OneToOne(mappedBy = "engine", cascade = CascadeType.ALL)
    private Car car;
}
