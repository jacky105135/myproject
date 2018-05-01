package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println(list);
		//沒有排序規則
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(1);
		System.out.println(set);
		
		Set<String> set1 = new HashSet<>();
		set1.add("Jack");
		set1.add("Hank");
		set1.add("Eric");
		set1.add("Hank");
		System.out.println(set1);
		
		SortedSet<String> sort = new TreeSet<>();
		sort.add("Jack");
		sort.add("Hank");
		sort.add("Eric");
		sort.add("Marvin");
		System.out.println(sort);
		
		Set<Integer> sort2 = new TreeSet<>();
		sort2.add(1);
		sort2.add(6);
		sort2.add(9);
		sort2.add(4);
		System.out.println(sort2);
		
		Map<String, String> stocks = new HashMap<>(); //Map(key,value)資料型態
		stocks.put("2330","TSMC");
		stocks.put("2454", "Mediatek");
		System.out.println(stocks);
		
		Map<String, String> stocks2 = new TreeMap<>();
		stocks2.put("2330", "TSMC");
		stocks2.put("2454","Mediatek");
		stocks2.put("2317", "HonHai");
		System.out.println(stocks2);
	}

}
