package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
	@Column(name="names")
     private String nameString;
     @Column(name="ranks")
     private int rank;
	public details(int id, String nameString, int rank) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.rank = rank;
	}
	public details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
     
}
