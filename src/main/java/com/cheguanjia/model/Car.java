package com.cheguanjia.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "car_number")
    private String carNumber;
    @Column(name = "car_color")
    private String carColor;
    @Column(name = "car_brand")
    private String carBrand;
    @Column(name = "car_liences")
    private String carLiences;
    @Column(name = "liences_location")
    private String liencesLocation;


    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarLiences() {
        return carLiences;
    }

    public void setCarLiences(String carLiences) {
        this.carLiences = carLiences;
    }

    public String getLiencesLocation() {
        return liencesLocation;
    }

    public void setLiencesLocation(String liencesLocation) {
        this.liencesLocation = liencesLocation;
    }
}
