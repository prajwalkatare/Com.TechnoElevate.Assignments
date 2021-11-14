package com.technoelevate.collectionarraylist.arraylistiteration;

import java.util.Iterator;

public class MyArrayListTest {

	public static void main(String[] args) {

		MyArrayList myArrayList = new MyArrayList(5);
		myArrayList.add(10);
		myArrayList.add(20);

		System.out.println(myArrayList.get(0));
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList);
		System.out.println("=========== Using iterator ==================");

		Iterator iterator = myArrayList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
