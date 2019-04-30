package com.soumyadeep.passByValueReferrence;

import java.util.ArrayList;
import java.util.List;

public class CallByValueReferrence3 {

	public static void main(String[] args) {

		/*
		 * There is only call by value in java, not call by reference. If we call a
		 * method passing a value, it is known as call by value. The changes being done
		 * in the called method, is not affected in the calling method.
		 */
		CallByValueReferrence3 obj = new CallByValueReferrence3();
		
		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("20");
		System.out.println("before change: "+ list);
		obj.change(list);
		System.out.println("after change: "+ list);
	}
	
	public void change(List list) {
		list.add("30"); //changes will be in the local variable only  
		list.add("40");
		System.out.println("in method change: "+ list);
	}
}
