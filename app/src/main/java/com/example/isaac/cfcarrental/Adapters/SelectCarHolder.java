package com.example.isaac.cfcarrental.Adapters;

public class SelectCarHolder {

    String plateNumber, price, milage, manufacture, model, carSeat, fuelType;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(String carSeat) {
        this.carSeat = carSeat;
    }

    public SelectCarHolder(String plateNumber, String price,
                           String milage, String manufacture, String model, String carSeat, String fuelType) {
        this.plateNumber = plateNumber;
        this.price = price;
        this.milage = milage;
        this.manufacture = manufacture;
        this.model = model;
        this.carSeat = carSeat;
        this.fuelType =fuelType;
    }
}
