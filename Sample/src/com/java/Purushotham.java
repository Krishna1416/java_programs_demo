package com.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Purushotham {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(44, "portrait");
		map.put(511, "sky");
		map.put(935, "veg");
		map.put(176, "Grass");

	
		List<String> list = new ArrayList<>();
		list.add("44");list.add("511");list.add("935");list.add("176");
		
		List<String> list222= new ArrayList<>();

		for (String itr : list) {
			if (map.containsKey(Integer.valueOf(itr))) {
				list222.add(map.get(Integer.valueOf(itr)));
			}
		}
		
		list.clear();
		list.addAll(list222);
		System.out.println(list);

	}

}
