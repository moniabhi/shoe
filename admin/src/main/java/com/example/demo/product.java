package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String product;
	private String description;
	private int price;
	private int quantity;
	
	public void deleteByid(int parseInt) {
		// TODO Auto-generated method stub
		
	}
}