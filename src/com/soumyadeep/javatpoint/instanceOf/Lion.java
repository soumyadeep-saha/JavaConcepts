package com.soumyadeep.javatpoint.instanceOf;

public class Lion extends Animal{

	public static void main(String[] args) {

		Lion lion = new Lion();
		Animal animal = new Animal();
		
		System.out.println(lion instanceof Animal); //true
		
		System.out.println(animal instanceof Lion); //false
	}
}
