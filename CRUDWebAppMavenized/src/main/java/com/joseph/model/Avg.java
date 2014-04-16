package com.joseph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avg {
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int ID;
	
	@Column
	private String Average;
	
	
	
	public Avg(){}
	public Avg(int ID, String Average) {
		super();
		this.ID = ID;
		this.Average = Average;
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getAverage() {
		return Average;
	}
	public void setAverage(String Average) {
		this.Average = Average;
	}
	

	
}
