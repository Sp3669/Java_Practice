package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {

	public static void main(String[] args) {
		//Array
		String[] studentName = new String[5];
		studentName[0] = "Somanjan";
		studentName[1] = "Sp";
		studentName[2] = "Sp369";
		studentName[3] = "Sp2026";
		studentName[4] = "Somanjan Pramanik";
		for(int i=0; i<5; i++) {
			System.out.println(studentName[i]);
		}
		/**
		 * here I directly told java that these keywords are from these java packages and it recognize it
		 */
		//java.util.List<String> name = new java.util.ArrayList<String>();
		
		//But better way to do this is using import keyword to import packages and classes from JRE library
		List<String> name = new ArrayList<String>();
		name.add("Somanjan");
		name.add("Sp369");
		System.out.println(name.size());
		System.out.println(name.get(0));
		System.out.println(name);
	}

}
