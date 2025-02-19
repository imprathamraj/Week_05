package com.json.practiceproblems.convertajavaobjectcarintojsonformat;

import org.json.JSONObject;

class Car {
    //Fields
    public String brand;
    public int year;

    //Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}
public class ConvertingAJavaObjectCarIntoJSONFormat {
    public static void main(String[]args){
        //Creating Car class car object
        Car car = new Car("Tesla Model Z", 2024);
        JSONObject jsonObject = new JSONObject();

        //Creating json object
        jsonObject.put("brand",car.brand);
        jsonObject.put("year",car.year);
        System.out.println(jsonObject.toString(5));
    }
}
