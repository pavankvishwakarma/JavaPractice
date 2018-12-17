package com.practice.DesignPatterns;

abstract class Car{
	public void carName() {
		System.out.print("General Car");
	}
	public abstract String getColour();
	public String toString() {
		return "This car is of colour "+getColour();
	}
}

class Maruti extends Car{
	String colour;
	
	Maruti(String colour){
		this.colour=colour;
	}
	
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return colour;
	}
	

	public void carName() {
		System.out.println("Maruti Car");
	}

}
class Sujuki extends Car{
	String colour;
	Sujuki(String colour){
		this.colour=colour;
	}
	
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return colour;
	}
	public void carName() {
		System.out.println("Sujuki Car");
	}
}

class carFactory{
	
	public static Car carFactoryMethod(String carName,String colour) {
		if(carName.equals("Maruti")) {
			return new Maruti(colour);
		}else if(carName.equals("Sujuki")) {
			return new Sujuki(colour);
		}
		return null;
	}
}


public class FactoryPattern {
	public static void main(String[] args) {
		Car c = carFactory.carFactoryMethod("Maruti","black");
		c.carName();
		System.out.println(c);
	}
}
