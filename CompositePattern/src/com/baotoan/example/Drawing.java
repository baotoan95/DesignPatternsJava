package com.baotoan.example;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		for(Shape shape : shapes) {
			shape.draw(fillColor);
		}
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}
	
	public void clear() {
		shapes.clear();
	}

}
