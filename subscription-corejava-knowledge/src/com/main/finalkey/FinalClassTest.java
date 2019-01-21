package com.main.finalkey;

class Machines {
	//define a final variable which cant be reassigned.
	final int parts = 4;
	String type;
	
	final static String machinesType = "Toyota Car";
		
	//final method with final parameter
	final void machinesType(final String type) {
		this.type = type;
	}
	
	//define final local variable
	public void test() {
		final String[] types = {"Automobile", "Car","Bike"};
		types [1] = "IamChanged";
		int size = types.length;
		while( size!= 0) {
			size--;
			System.out.println(types[size]);
		}
	}
}

final class Car extends Machines {
	
	  final void Car() {
		System.out.println("Its final constructor");
	}
	//We cant override final method machinesType() from class Machines
	/*
	@Override
	final void  machinesType(final String type) {
		
	}
	*/
	
	public void display() {
		System.out.println("This is Final CAR class-"+type);
	}
}

//will give compilation error Car class cannt be subclass the final class Machines
/*class Car extends Machines {
	
}*/


public class FinalClassTest {

	public static void main(String[] args) {
		final Car car = new Car();
		car.type = "I am car";
		car.type = "I am not just CAR";
		
		car.machinesType("TIAGO");
		car.display();
		car.test();
		
		System.out.println("-----------2nd Object -------------");
		Car car1 = new Car();
		car1.display();
		car1.test();
	}

}
