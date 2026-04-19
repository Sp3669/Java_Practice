package com.automation.elements;

import java.util.LinkedList;
import java.util.List;

public class Main {
/**
 * This is main method; form where JVM execution process starts.
 * @param This takes input of array of strings i.e. String[] or String... (input).
 * @return This doesn't return anything; only executes the program inside of it.
 * @author Somanjan Pramanik (somanjan1606@gmail.com).
 * @throws NullPointerException (No error should be expected). 
 *
 */
	public static void main(String[] args) {
		// The Task: 
		//1. Create a List that holds UIElement types.
		//2. Add one Button object and one CheckBox object to that list.
		//3. Use a for-each loop to iterate through the list and call the .interact() method on each object.
		List<UIElement> elementTypes = new LinkedList<UIElement>();
		Button button1 = new Button();
		CheckBox checkBoxo1 = new CheckBox();
		elementTypes.add(button1);
		elementTypes.add(checkBoxo1);
		elementTypes.add(null);
		try {
		for (UIElement value : elementTypes ) {
			value.interact();
		}
		}catch (Exception e) {
			System.out.println("!!Error!!"+e);
			System.err.println("Please check the list again");
		}finally {
			System.out.println("Execution completed");
		}

	}

}
