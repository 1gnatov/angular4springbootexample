package com.example.angulardemo.models;

public class Product {

	private String mLabel;
	private Integer mId;
	private Double mPrice;

	public Product(Integer pId, String pLabel, Double pPrice) {
		mId = pId;
		mLabel = pLabel;
		mPrice = pPrice;
	}

	public String getLabel() {
		return mLabel;
	}

	public void setLabel(String pLabel) {
		mLabel = pLabel;
	}

	public Integer getId() {
		return mId;
	}

	public void setId(Integer pId) {
		mId = pId;
	}

	public Double getPrice() {
		return mPrice;
	}

	public void setPrice(Double pPrice) {
		mPrice = pPrice;
	}
}
