package com.Gamescorejavaprogram;


import java.util.HashMap;
import java.util.Map;

public class DMV {
    public static Map<String, Driver> drivers;


    public static void fillUpDrivers() {
         drivers= new HashMap< >();
          Driver d1= new Driver();
          d1.setName("Nischit");
          d1.setAddress("Fairfax,Virginia");
          d1.setAge(25);
          d1.setDate(10/12/1994);
          d1.setLiscenseNo("12345");

          Driver d2= new Driver();
          d2.setName("Saroj");
          d2.setAddress("Fairfax,Virginia");
          d2.setAge(24);
          d2.setDate(6/12/1995);
          d2.setLiscenseNo("54321");

        Driver d3= new Driver();
        d3.setName("Sam");
        d3.setAddress("Richmond,Virginia");
        d3.setAge(23);
        d3.setDate(1/8/1996);
        d3.setLiscenseNo("54342");


        Driver d4= new Driver();
        d4.setName("Ram");
        d4.setAddress("Waltham,Virginia");
        d4.setAge(30);
        d4.setDate(9/8/1990);
        d4.setLiscenseNo("65757");

        Driver d5= new Driver();
        d5.setName("Sid");
        d5.setAddress("Richmond,Virginia");
        d5.setAge(35);
        d5.setDate(1/10/1985);
        d5.setLiscenseNo("76321");
        drivers.put(d1.getLiscenseno(),d1);
        drivers.put(d2.getLiscenseno(),d2);
        drivers.put(d3.getLiscenseno(),d3);
        drivers.put(d4.getLiscenseno(),d4);
        drivers.put(d5.getLiscenseno(),d5);

    }

}

