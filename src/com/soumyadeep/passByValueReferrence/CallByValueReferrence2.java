package com.soumyadeep.passByValueReferrence;

public class CallByValueReferrence2 {

	int data = 50;

	public static void main(String[] args) {

		/*
		 * In case of call by reference original value is changed if we made changes in
		 * the called method. If we pass object in place of any primitive value,
		 * original value will be changed. In this example we are passing object as a
		 * value
		 */

		CallByValueReferrence2 obj = new CallByValueReferrence2();
		System.out.println("before change: " + obj.data);
		obj.change(obj); //passing object
		System.out.println("after change: " + obj.data);
	}

	public void change(CallByValueReferrence2 obj) {
		obj.data = obj.data + 150;
	}
}
