package com.automation.elements;
/**
 * This is a Class named "Button"
 * which implement the interface "UIElement"
 * Here We define the "interact" method
 */
public class Button implements UIElement {
	/**
	 * @param takes none as input 
	 * @return none as it is a void method
	 * It is a overriding polymorphism aka run-time polymorphism
	 * @throws NullPointerException
	 */
	@Override
	public void interact() {
		System.out.println("Button clicked: Action performed.");
	}

}
