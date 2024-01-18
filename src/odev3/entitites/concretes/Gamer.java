package odev3.entitites.concretes;

import odev3.entitites.abstracts.Entity;

public class Gamer implements Entity {

	private int id;
	private String name;
	private double unitPrice;
	
	public Gamer() {
		
	}

	public Gamer(int id, String name, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
