package com.fannie.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExp1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Sunita", 10);
		map.put("Change", 103);
		map.put("Hu", 1312540);
		map.put("Al", 13130);
		map.put("Al", 333);
		map.put("wh", 13410);

		 System.out.println(map);
		//
		// System.out.println(map.get("Al"));

		Set set = map.entrySet();
		System.out.println(set);
		
		Iterator itr = set.iterator();
		
		while (itr.hasNext()){
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next();
			System.out.println(temp.getKey()+", "+temp.getValue());
		}

	}
}
