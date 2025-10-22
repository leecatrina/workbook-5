package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Reservation reservation1 = new Reservation("King", 1, false);
        System.out.println(reservation1.getReservationTotal());


        Reservation reservation2 = new Reservation("King", 1, true);
        System.out.println(reservation2.getReservationTotal());


    }
}
