package com.hibernate.lessons.one_to_one.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "engine")
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "horse_power")
    private int horsePower;
    @Column(name = "volume")
    private int volume;

    @OneToOne(mappedBy = "carEngine", cascade = {
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private Car car;

    public Engine() {
    }

    public Engine(int horsePower, int volume) {
        this.horsePower = horsePower;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Engine{" +
               "id=" + id +
               ", horsePower=" + horsePower +
               ", volume=" + volume +
               '}';
    }
}
