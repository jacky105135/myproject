package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	private static Object[] strArray;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		List list = Arrays.asList(s.nextLine());
		String t1 = list.toString();
		String a = t1.replace("[", "");
		String b = a.replace("]", "");
		System.out.println(b);
		String[] c = b.split(" ");
		for (int i = 0; i < c.length; i++) {
			
			System.out.print(c[i]+ " ");
			
		}


		// List<GreekLetter> letterList = new ArrayList<>();
		// letterList.add(new GreekLetter("Gamma", 3));
		// letterList.add(new GreekLetter("Omega", 24));
		// letterList.add(new GreekLetter("Alpha", 1));
		//
		//
		// //write your code here
		//
		//
		// Object[] objArray = letterList.toArray();
		// for (int i = 0; i < objArray .length; i++) {
		// System.out.println(objArray[i]);
		// }
		// }
		//
		// static class GreekLetter {
		//
		// private String letter;
		// private Integer position;
		//
		// public GreekLetter(String letter, Integer position) {
		// this.letter = letter;
		// this.position = position;
		// }
		//
		// @Override
		// public String toString() {
		// return "{" +
		// "letter='" + letter + '\'' +
		// ", position=" + position +
		// '}';
		// }

		// List<Integer> list = Arrays.asList(2,0,1,7);
		// list.add(2);
		// list.add(0);
		// list.add(1);
		// list.add(7);
		// List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green",
		// "Mr.Yellow", "Mr.Red"));
		//
		//// for (String name:nameList) {
		//// System.out.println(name);
		//// }
		//
		// strArray = nameList.toArray();
		//
		// for (int i = 0; i < strArray.length; i++) {
		// System.out.println(strArray[i]);
		// }

	}

}
