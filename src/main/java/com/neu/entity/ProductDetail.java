package com.neu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="product_type", catalog = "QuanLyBanHang")
@PrimaryKeyJoinColumn(name="id")
public class ProductDetail extends Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	
//	@OneToOne
//	@JoinColumn(name="product_id")
//	private Product productId;
	
	@Column(name = "size", length = 30)
	private int size;
	
	@Column(name = "color", length = 30)
	private String color;

//	public Product getProductId() {
//		return productId;
//	}
//
//	public void setProductId(Product productId) {
//		this.productId = productId;
//	}

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product productId;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
//
//	@Override
//	public String toString() {
//		return "ProductType [productId=" + productId + ", size=" + size + ", color=" + color + "]";
//	}
	
	
}
