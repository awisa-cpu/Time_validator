package com.company;
import java.util.Scanner;

public class TimeValidator{
    public static void main(String[] args) {

	Scanner input=new Scanner(System.in);//instantiate an object of scanner class


        System.out.print("Hour: ");
        int hour=input.nextInt();
        System.out.print("Minutes: ");
        int min=input.nextInt();
        System.out.print("Seconds: ");
        int sec=input.nextInt();

        Validator user1=new Validator(hour,min,sec);//instantiate an object of validator classdator

        //set values to accessor method of validator class
        //user1.setTime(hour,min,sec);
        user1.validateTime();
    }
}


