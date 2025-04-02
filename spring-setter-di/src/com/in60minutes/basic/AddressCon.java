package com.in60minutes.basic;

public class AddressCon {
    private String stuCity;
    private int stuPin;

    public AddressCon() {
        System.out.println("Address construcion injection ...");
    }

    public AddressCon(String stuCity, int stuPin) {
        this.stuCity = stuCity;
        this.stuPin = stuPin;
    }

    public String getStuCity() {
        return stuCity;
    }

    public int getStuPin() {
        return stuPin;
    }
}
