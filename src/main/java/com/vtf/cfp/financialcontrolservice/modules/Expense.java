package com.vtf.cfp.financialcontrolservice.modules;

public class Expense {

	private String id;
	private String description;
	
	public Expense() {
		
	}
	
	public Expense(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
