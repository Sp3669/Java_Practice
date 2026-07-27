package com.creatio.crm.language.basics;

public class Counter {
	private static long count = 0;
	private long id;

	Counter() {
		Counter.count += 1;
		this.id = count;
	}

	public void getId() {
		System.out.println(id);
	}
}
