package com.app.stepdefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testone {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		
		List<Map<String , Integer>> l2 = new ArrayList<Map<String,Integer>>();
		l2.add(map);
		l2.get(0).get("a");
		
		
		List<String> l1 = new ArrayList<String>();
		l1.add("1");
		
		List<List<String>> li = new ArrayList<List<String>>();
		li.add(l1);
		System.out.println(li.get(0).get(0));
		
		
	}
}
