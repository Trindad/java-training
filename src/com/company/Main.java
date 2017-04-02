package com.company;
import com.company.animal.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello animals");

	    Canine canine = new Canine();
	    canine.makeNoise();
	    canine.roam();

	    Dog dog = new Dog();
	    dog.makeNoise();

	    Cat jude = new Cat("Jude");
	    jude.makeNoise();

		Cat jaspion = new Cat();
		jaspion.makeNoise();

	    Hippo hippo = new Hippo();
	    hippo.makeNoise();

    }
}
