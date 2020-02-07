package com.Gamescorejavaprogram;

import java.util.Date;

 class Driver {

     private String liscenseno;
     private int date;
     private String name;
     private String address;
     private int age;

     @Override
     public String toString() {
         return "Driver{" +
                 "liscenseno='" + liscenseno + '\'' +
                 ", date=" + date +
                 ", name='" + name + '\'' +
                 ", address='" + address + '\'' +
                 ", age=" + age +
                 '}';
     }

     public String getLiscenseno() {
         return liscenseno;
     }

     public void setLiscenseNo(String liscenseno) {
         this.liscenseno = liscenseno;
     }

     public int getDate() {
         return date;
     }

     public void setDate(int date) {
         this.date = date;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }

