package com.simplilearn.collectionlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		Integer array[]= {10,20,30,20,50};
		Collections.addAll(list, array);
		
		//list.add(10);
		//list.add(20);
		//list.add(30);
		//list.add(20);
		//list.add(50);
		System.out.println(list);
		list.remove(3);
		System.out.println("After remove: "+list);
		System.out.println("List Size: "+list.size());
		System.out.println("Check it contain 50 or not "+list.contains(50));
		
		System.out.println("Iterate using for each loop");
		for(Integer num:list)
			System.out.println(num);
		System.out.println("use Iterator");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
