package com.company.animal;

/**
 * Created by silvana on 4/1/17.
 */
public class Animal {

    String picture;
    String food;
    String hunger;
    String boundaries;
    String location;

    public void makeNoise() {
        System.out.println("Make noise.");
    }
    public void eat() {
        System.out.println("I can eat.");
    }

    public void sleep() {
        System.out.println("I can sleep.");
    }
    public String roam() {
        return "I can roam.";
    }

}
