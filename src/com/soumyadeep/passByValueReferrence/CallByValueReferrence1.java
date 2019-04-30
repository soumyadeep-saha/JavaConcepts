package com.soumyadeep.passByValueReferrence;

public class CallByValueReferrence1 {

	int data = 50;
	
	public static void main(String[] args) {

		/*
		 * There is only call by value in java, not call by reference. If we call a
		 * method passing a value, it is known as call by value. The changes being done
		 * in the called method, is not affected in the calling method.
		 */
		CallByValueReferrence1 obj = new CallByValueReferrence1();
		System.out.println("before change: "+ obj.data);
		obj.change(200);
		System.out.println("after change: "+ obj.data);
	}
	
	public void change(int data) {
		data = data+150; //changes will be in the local variable only  
	}
}
