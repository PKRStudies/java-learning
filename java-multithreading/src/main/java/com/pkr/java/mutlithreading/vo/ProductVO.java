package com.pkr.java.mutlithreading.vo;

public class ProductVO {
	private String name;
	
	private int weight;
	
	private String countryOfOrigin;
	
	private int pricePerPiece;
	
	public ProductVO(String name, int weight, String countryOfOrigin, int pricePerPiece) {
		super();
		this.name = name;
		this.weight = weight;
		this.countryOfOrigin = countryOfOrigin;
		this.pricePerPiece = pricePerPiece;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getPricePerPiece() {
		return pricePerPiece;
	}

	public void setPricePerPiece(int pricePerPiece) {
		this.pricePerPiece = pricePerPiece;
	}

	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", weight=" + weight + ", countryOfOrigin=" + countryOfOrigin
				+ ", pricePerPiece=" + pricePerPiece + "]";
	}
	
}