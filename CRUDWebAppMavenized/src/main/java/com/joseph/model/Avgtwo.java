package com.joseph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avgtwo {
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int id;
	
	@Column
	private String avg;
	
	@Column
	private String count;
	
	@Column
	private String std;
	
	
	public Avgtwo(){}
	public Avgtwo(int id, String avg, String count, String std) {
		super();
		this.id = id;
		this.avg = avg;
		this.count = count;
		this.std= std;
		
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getavg() {
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getcount() {
		return count;
	}
	public void setcount(String count) {
		this.count = count;
	}
	public String getstd() {
		return std;
	}
	public void setavg(String std) {
		this.std = std;
	}
	
}