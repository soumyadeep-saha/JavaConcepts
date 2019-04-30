package com.soumyadeep.passByValueReferrence;

public class CallByValueReferrenceJournalDev {

	/*
	 * Pass by Value: The method parameter values are copied to another variable and
	 * then the copied object is passed, that’s why it’s called pass by value. Pass
	 * by Reference: An alias or reference to the actual parameter is passed to the
	 * method, that’s why it’s called pass by reference.
	 */

	/*
	 * Java is always Pass by Value and not pass by reference, we can prove it with
	 * a simple example.
	 */

	public static void main(String[] args) {

		Balloon red = new Balloon("red"); // 366712642
		Balloon blue = new Balloon("blue"); // 1829164700
		System.out.println("Red balloon hashcode: " + red.hashCode() + " Blue balloon hashcode: " + blue.hashCode());

		swap(red, blue);
		System.out.println("Red balloon hashcode after swapping: " + red.hashCode()
				+ " Blue balloon hashcode after swapping: " + blue.hashCode());
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("Red balloon hashcode after foo: " + red.hashCode() + " Blue balloon hashcode after foo: "
				+ blue.hashCode());
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

	}

	private static void foo(Balloon balloon) {
		balloon.setColor("red");
		balloon = new Balloon("green");
		balloon.setColor("blue");
	}

	/*
	 * The first line is the important one, when we call a method the method is
	 * called on the Object at the reference location. At this point, balloon is
	 * pointing to 100 and hence it’s color is changed to Red.
	 */
	/*
	 * In the next line, ballon reference is changed to 200 and any further methods
	 * executed are happening on the object at memory location 200 and not having
	 * any effect on the object at memory location 100. This explains the third line
	 * of our program output printing blue color=Red.
	 */

	private static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o1 = temp;
	}

	/*
	 * If you look at the first two lines of the output, it’s clear that swap method
	 * didn’t worked. This is because Java is pass by value, this swap() method test
	 * can be used with any programming language to check whether it’s pass by value
	 * or pass by reference. Now when we are calling swap() method, two new
	 * variables o1 and o2 are created pointing to 50 and 100 respectively. Notice
	 * that we are changing values of o1 and o2 but they are copies of “red” and
	 * “blue” reference locations, so actually there is no change in the values of
	 * “red” and “blue” and hence the output.
	 */
	/*
	 * If you have understood this far, you can easily understand the cause of
	 * confusion. Since the variables are just the reference to the objects, we get
	 * confused that we are passing the reference so java is pass by reference.
	 * However we are passing a copy of the reference and hence it’s pass by value.
	 */

	/*
	 * I hope above explanation clear all the doubts, just remember that variables
	 * are references or pointers and it’s copy is passed to the methods, so java is
	 * always pass by value.
	 */
}

class Balloon {

	private String color;

	public Balloon() {
	}

	public Balloon(String c) {
		this.color = c;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
