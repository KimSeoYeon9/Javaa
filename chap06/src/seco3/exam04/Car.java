package seco3.exam04;

import javax.management.modelmbean.ModelMBean;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//생성자
	Car() {
	}
	
	Car(String model) {
	this(model, null, 0);
	}
	
	Car(String model, String color) {
	this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
	}
}
