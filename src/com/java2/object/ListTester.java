package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(0);
			list.add(1);
			list.add(2);
			list.add(3);
			System.out.println("deleting number: " + list.remove(0));
			System.out.println(list.size());
			System.out.println(list.get(1));
			
	}

}
