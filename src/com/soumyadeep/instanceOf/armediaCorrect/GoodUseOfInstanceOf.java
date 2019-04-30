package com.soumyadeep.instanceOf.armediaCorrect;

public class GoodUseOfInstanceOf {

	public static void main(String[] args) {

		makeItMove(new Fish());
		makeItMove(new Bird());
		makeItMove(new Kangaroo());
	}

	private static void makeItMove(Animal animal) {
		animal.move();
	}
}
