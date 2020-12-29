package com.develop.custom.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RepeatedChar {

	// A Apple Is Green

	public String firstNonRepeatedChar(String sentence) {

		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		var dataVal=sentence.trim().toCharArray();

		for(var data:dataVal) {
			if(map.containsKey(data)) {
				var value = map.get(data);
				map.put(data, value+1);
			}else {
				map.put(data,1);
			}
		}
		System.out.println(dataVal);
		for(var item:dataVal) {
			if(map.get(item)==1) {
				return String.valueOf(item);
			}
		}
		
		return null;
	}

	// A Apple Is Green

	public String firstRepeatedChar(String sentence) {

		char data[]=sentence.trim().toCharArray();
		Map<Character,Character> map = new HashMap<Character,Character>();

		for(int i=0;i<=data.length;i++) {
			if(map.keySet()!=null && map.keySet().size()>0) {
				if(map.containsKey(data[i])) {
					return String.valueOf(data[i]);
				}
			}
			map.put(data[i],data[i]);
		}
		return null;
	}

}
