package com.soumyadeep.instanceOf.armediaWrong;

public class BadUseOfInstanceOf {

	public static void main(String[] args) {

		makeItMove(new Fish());
		makeItMove(new Bird());
		makeItMove(new Kangaroo());
	}

	private static void makeItMove(Animal animal) {

		if(animal instanceof Fish) {
			Fish fish = (Fish)animal;
			fish.swim();
		}else if(animal instanceof Bird) {
			Bird bird = (Bird)animal;
			bird.fly();
		}else if(animal instanceof Kangaroo){
			Kangaroo kangaroo = (Kangaroo)animal;
			kangaroo.jump();
		}
	}
}
