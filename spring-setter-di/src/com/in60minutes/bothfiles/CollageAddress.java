package com.in60minutes.bothfiles;

public class CollageAddress {
    private String collageCity;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("state in CollageAddress ...");
        this.state = state;
    }

    public String getCollageCity() {
        return collageCity;
    }

    public void setCollageCity(String collageCity) {
        System.out.println("city in CollageAddress");
        this.collageCity = collageCity;
    }

    public void getAll(){
        System.out.println(collageCity);
        System.out.println(state);
    }
}
