package com.tnsif.day6.usingfinal;
class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

class FinalChildClass extends FinalClass {
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); 
	}
}