package com.stackroute;

public class Address {
    String city;
    String state;
    int pin;

    public Address(){
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Address(String city, String state, int pin) {
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public void myInit(){
        System.out.println("---Object of Address Initialized---");
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }

    public void myDestroy(){
        System.out.println("---Object of Address Destroyed---");
    }
}
