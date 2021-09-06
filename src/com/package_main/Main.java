package com.package_main;

//First way
//import com.package_a.Animal;
//import com.package_b.Person;
//import com.package_a.*;

//Second way
//import com.package_a.*;


import com.package_a.*;
import com.package_a.package_c.*;
public class Main {
    public static void main(String[] args) {
        //Package may contain:
        //1. Classes
        //2. Interfaces
        //3. Enumerations
        //4. Annotations
        com.package_a.Person person_a=new com.package_a.Person();
        com.package_b.Person person_b=new com.package_b.Person();

        Person person=new Person();
        Helicopter apache=new Apache();
//        Animal animal=new Animal();

        //Third way
//        com.package_b.Car car = new com.package_b.Car();
    }
}
