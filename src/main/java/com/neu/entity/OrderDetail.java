package com.neu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail", catalog = "QuanLyBanHang")
@PrimaryKeyJoinColumn(name = "id")
public class OrderDetail extends Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	@Column(name = "quantity")
	private int quantity;
//	
//	@OneToMany
//	@JoinColumn(name = "product_id")
//	private int productId;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	public int getProductId() {
//		return productId;
//	}
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//	@Override
//	public String toString() {
//		return "OrderDetail [quantity=" + quantity + ", productId=" + productId + "]";
//	}
//	
	
}
