package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int perKmRate;
    private boolean Available;
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab(int id, int perKmRate, boolean available, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        Available = available;
        this.driver = driver;
    }

    public Cab() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}