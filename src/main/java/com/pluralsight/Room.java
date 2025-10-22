package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    //Derived getter - calculates from other variables
    public boolean isDirty() {
        return isDirty;
    }
    //New method
    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }
    public void checkIn() {
        isOccupied = true;
        isDirty = true;
    }
    public void checkOut() {
        isOccupied = false;
        // Room stays dirty until cleaned
    }
    public void cleanRoom() {
        isDirty = false;
    }
}
