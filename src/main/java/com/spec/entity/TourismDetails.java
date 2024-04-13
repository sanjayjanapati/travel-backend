package com.spec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TourismDetails 
{
	@Id
	private String name;
	private String imgUrl;
	private String price;
	public TourismDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TourismDetails(String name, String imgUrl, String price) {
		super();
		this.name = name;
		this.imgUrl = imgUrl;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
