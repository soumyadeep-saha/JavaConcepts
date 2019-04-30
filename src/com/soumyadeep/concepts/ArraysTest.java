package com.soumyadeep.concepts;

import java.util.ArrayList;
import java.util.List;

public class ArraysTest {

	public static void main(String[] args) {


		String s = "11-11-1- 2 -2 -3--4-4-5-///6-6";
        final String pattern = "[ -/]";
        String str = s.replaceAll(pattern,"");
        System.out.println(str);
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++) {
        	list.add(Character.toString(str.charAt(i)));
        }
        System.out.println(list);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<list.size(); i++) {
        	if(i%3!=0) {
        		sb.append(list.get(i));
        	}else if(i%3==0) {
        		sb.append("-").append(list.get(i));
        	}
        }
        sb.deleteCharAt(0);
        System.out.println(sb);
	}
}
