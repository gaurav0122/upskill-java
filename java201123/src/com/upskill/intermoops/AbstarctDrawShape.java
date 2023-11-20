package com.upskill.intermoops;

public class AbstarctDrawShape {
	
	public static void main(String[] args) {
		
		Shape lineShape = new Line();
		Shape RectShape = new Rectangle();
		Shape cubeShape = new Cube();
		
		System.out.println(lineShape.draw());
		System.out.println(RectShape.draw());
		System.out.println(cubeShape.draw());
	}
	
}

abstract class Shape{
	
	abstract String draw();
}

class Line extends Shape{

	@Override
	String draw() {
		return "Line";
	}
	
}
class Rectangle extends Shape{

	@Override
	String draw() {
		return "Reactangle";
	}
	
}
class Cube extends Shape{

	@Override
	String draw() {
		return "Cube";
	}
	
}