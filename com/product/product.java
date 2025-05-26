package com.product;
import com.manufacturer.*;

public class product {
	private String product;
	private String category;
	private manufacturer manufacturer;
	private double price;
	private product(String product, String category, manufacturer manufacturer, double price) {
		super();
		this.product = product;
		this.category = category;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "product [product=" + product + ", category=" + category + ", price=" + price + "]";
	}
	public static product getproduct(String product, String category, manufacturer manufacturer, double price)
	{
		return new product(product, category, manufacturer,price);
	}
	
	
}
