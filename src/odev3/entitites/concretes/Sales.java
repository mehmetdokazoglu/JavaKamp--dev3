package odev3.entitites.concretes;

import odev3.entitites.abstracts.Entity;

public class Sales implements Entity {

	private int id;
	private String name;
	
	
	public Sales() {
		
	}
	public Sales(int id, String name) {
		this.id=id;
		this.name=name;
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
	
}
