package com.technoelevate.hashsetsortoperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColleaguesCollection {

	public static void main(String[] args) {
		List<Colleagues> list=new ArrayList<Colleagues>();
		list.add(new Colleagues("Saurabh", 22, "Best Friend"));
		list.add(new Colleagues("Aniket", 29, "Friend"));
		list.add(new Colleagues("Rushi", 23, "Just Friend"));
		list.add(new Colleagues("Umesh", 25, "Not a friend"));
		list.add(new Colleagues("Swapnil", 21, "Friend"));
		list.add(new Colleagues("Kuldip", 30, "Friend"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		System.out.println("============Using Comparator Method==============");
		ComparatorColleagues sp=new ComparatorColleagues();
		Collections.sort(list,sp);
		System.out.println(list);

	}

}
