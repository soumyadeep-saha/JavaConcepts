package com.soumyadeep.javatpoint.instanceOf;

public class Simple1 {

	public static void main(String[] args) {

		Simple1 s1 = new Simple1();
		System.out.println(s1 instanceof Simple1); //true
		
		Simple1 s2 = null;
		System.out.println(s2 instanceof Simple1); //false
	}
}
