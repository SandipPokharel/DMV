package com.Gamescorejavaprogram;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DriverFinder df = new DriverFinder();
        DMV.fillUpDrivers();
        Driver d = df.getDriverByLiscense("12345");
        System.out.println(d.toString());
        List<Driver> d1= df.getAllDrivers();
        //System.out.println(d1.toString());
        for (Driver obj : d1) {
            System.out.println(obj.toString());
        }

    }
}
