package com.example.isaac.cfcarrental.Adapters;

import android.widget.TextView;

public class SelectCarHolder {

    TextView plateNumber, price, milage, manufacture, model, carSeat, fuelType;

    public TextView getFuelType() {
        return fuelType;
    }

    public void setFuelType(TextView fuelType) {
        this.fuelType = fuelType;
    }

    public TextView getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(TextView plateNumber) {
        this.plateNumber = plateNumber;
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(TextView price) {
        this.price = price;
    }

    public TextView getMilage() {
        return milage;
    }

    public void setMilage(TextView milage) {
        this.milage = milage;
    }

    public TextView getManufacture() {
        return manufacture;
    }

    public void setManufacture(TextView manufacture) {
        this.manufacture = manufacture;
    }

    public TextView getModel() {
        return model;
    }

    public void setModel(TextView model) {
        this.model = model;
    }

    public TextView getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(TextView carSeat) {
        this.carSeat = carSeat;
    }

    public SelectCarHolder(TextView plateNumber, TextView price,
                           TextView milage, TextView manufacture, TextView model, TextView carSeat, TextView fuelType) {
        this.plateNumber = plateNumber;
        this.price = price;
        this.milage = milage;
        this.manufacture = manufacture;
        this.model = model;
        this.carSeat = carSeat;
        this.fuelType =fuelType;
    }
}
