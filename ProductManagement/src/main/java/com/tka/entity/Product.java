package com.tka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product", schema = "advjava193demo1")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private int price;
	@Column(name = "qty")
	private int qty;
	@Column(name = "category")
	private String category;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product() {
		super();
	}

	public Product(String name, int price, int qty, String category) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.category = category;
	}
	
	

	public Product(int pid, String name, int price, int qty, String category) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + "]";
	}

}
