package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
    private Long id;
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int engineCapacity;
    private String fuelType;
    private int power;
    private int torque;
    private int trunkVolume;
    private double price;
    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

