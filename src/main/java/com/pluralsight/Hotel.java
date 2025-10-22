package com.pluralsight;

public class Hotel {
    //field members, backing fields/variables
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    //getters
    public int getAvailableSuites() {
        return numberOfSuites = bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (getAvailableRooms() >= numberOfRooms) {
            bookedBasicRooms = bookedBasicRooms + numberOfRooms;
            return true;
        }else{
            return false;
        }
    }
}


