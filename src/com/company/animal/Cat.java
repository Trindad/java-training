package com.company.animal;

/**
 * Created by silvana on 4/2/17.
 */
public class Cat extends Feline{
    private String name;

    public Cat() {

    }

    public Cat(String n) {
      this.name = n;
    }

    public void makeNoise() {
        System.out.println("Meow meow...meow.");
    }
    public void eat() {
        System.out.println("I can eat cat food and meat.");
    }

    public String greet() {
        return "Hi, I'm " + name;
    }
}
