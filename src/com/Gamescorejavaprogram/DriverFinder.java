package com.Gamescorejavaprogram;

import java.util.ArrayList;
import java.util.List;

public class DriverFinder {


    public Driver getDriverByLiscense(String liscenseno){
        return DMV.drivers.get(liscenseno);
    }
    public List<Driver> getAllDrivers(){
        return new ArrayList<Driver>(DMV.drivers.values());
    }
    }

