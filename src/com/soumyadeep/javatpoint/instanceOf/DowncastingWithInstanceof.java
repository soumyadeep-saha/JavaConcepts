package com.soumyadeep.javatpoint.instanceOf;

public class DowncastingWithInstanceof extends Animal {

	public static void main(String[] args) {

		/*
		 * Type mismatch: cannot convert from Animal to DowncastingWithInstanceof
		 * DowncastingWithInstanceof obj = new Animal();
		 */

		/*
		 * Compiles successfully but ClassCastException is thrown at runtime
		 * com.soumyadeep.javatpoint.instanceOf.Animal cannot be cast to
		 * com.soumyadeep.javatpoint.instanceOf.DowncastingWithInstanceof at
		 * com.soumyadeep.javatpoint.instanceOf.DowncastingWithInstanceof.main(
		 * DowncastingWithInstanceof.java:12) DowncastingWithInstanceof obj =
		 * (DowncastingWithInstanceof) new Animal();
		 */

		Animal a = new DowncastingWithInstanceof();
		DowncastingWithInstanceof.method(a);
	}

	private static void method(Animal a) {

		if (a instanceof DowncastingWithInstanceof) {
			DowncastingWithInstanceof d = (DowncastingWithInstanceof) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}
}
