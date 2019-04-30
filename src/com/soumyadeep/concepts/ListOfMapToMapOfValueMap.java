package com.soumyadeep.concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfMapToMapOfValueMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");

		List<Map> list = new ArrayList<>();
		list.add(map);

		Map<String, Map> newMap = new HashMap<>();

		for (Map m : list) {

			Set e = m.entrySet();
			Iterator i = e.iterator();
			while (i.hasNext()) {
				Entry e1 = (Map.Entry) i.next();
				newMap.put((String) e1.getValue(), m);
			}

		}

		for (Entry<String, Map> e1 : newMap.entrySet()) {
			System.out.println(e1.getKey() + " : " + e1.getValue());
		}

		Map<String, Map> java8map = list.stream().collect(Collectors.toMap(p -> {

			Set<Map.Entry<String, String>> set = p.entrySet();
			Iterator itr = set.iterator();
			String value = null;
			while (itr.hasNext()) {
				value = (String) ((Entry) itr.next()).getValue();
				break;
			}
			return value;
		}, p -> p));
		System.out.println("java8Map" + java8map);

		Map<String, Map> java8map1 = list.stream().collect(Collectors.toMap(p -> {
			Object o = (((Map) p).entrySet().stream().findFirst().get());
			Map.Entry entryMap = (Map.Entry) o;
			System.out.println("o class" + o.getClass());
			return (String) entryMap.getValue();
		}, p -> p));

		System.out.println("java8Map1" + java8map1);
	}

	/*
	 * Map<String, Map> result = new HashMap<>(); list.stream().forEach(map1 -> {
	 * result.putAll((Map<? extends String, ? extends Map>) map1.entrySet().stream()
	 * .collect(Collectors.toMap(entry -> ((Entry) entry).getValue(), entry ->
	 * entry))); });
	 * 
	 * System.out.println("Result" + result);
	 */
	/*
	 * Map<String, String> result = new HashMap<>(); list.stream().forEach(m -> {
	 * result.put(m.entrySet().stream().collect(Collectors.toList(entry -> entry.,
	 * entry ->entry)), value); });
	 * 
	 * 
	 * }
	 */

	public static String getValue(Map<String, String> map) {

		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator itr = set.iterator();
		String value = null;
		while (itr.hasNext()) {
			value = (String) ((Entry) itr.next()).getValue();
			break;
		}
		return value;
	}
}
