package com.company;

public class Validator{
    //instance or non-static variable
    private int val_hour;
    private int val_minutes;
    private int val_seconds;

    /*
//using the accessor method to set values to instance variables
    public void setTime(int hh, int mm, int ss) {
        hour = hh;
        minutes = mm;
        seconds = mm;
    }
    */
    public Validator(int hh, int mm, int ss){//using user-defined constructor to assign values
        val_hour = hh;
        val_minutes = mm;
        val_seconds = mm;
    }
    public void validateTime() {
        if (val_hour >= 0 && val_hour <= 23 && val_minutes >= 0 && val_minutes <= 59 && val_seconds >= 0 && val_seconds <= 59) {
            System.out.println("HH:"+val_hour + "  "+"MM:"+val_minutes +"  "+"SS:"+val_seconds);
        } else {
            System.out.println("Wrong input entered");
        }
    }
}