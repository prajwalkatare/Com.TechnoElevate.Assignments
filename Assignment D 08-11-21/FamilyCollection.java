package com.technoelevate.hashsetsortoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FamilyCollection {

	public static void main(String[] args) {
		HashSet<Family> set=new HashSet<Family>();
		set.add(new Family("Raju","Father", 52));
		set.add(new Family("Mahananda","Mother", 45));
		set.add(new Family("Priyanka","Sister", 27));
		set.add(new Family("Pranali","Sister",18));
		set.add(new Family("Sulochna","Grandmother", 76));
		set.add(new Family("Prajwal","I", 22));
		ArrayList<Family> list=new ArrayList<Family>(set);
		System.out.println(list);
		System.out.println("===========Using Comparable Method=============");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("============Using Comparator Method============");
		ComparatorFamily gk=new ComparatorFamily();
		Collections.sort(list,gk);
		System.out.println(list);

	}

}
