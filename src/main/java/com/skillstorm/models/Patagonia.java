package com.skillstorm.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "patagonia")
public class Patagonia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clothing_id")
	private int clothingId;

	@Column(name = "color")
	private String color;

	@Column(name = "size")
	private String size;

	@Column(name = "style")
	private String style;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private double price;

	public Patagonia() {}

	public Patagonia(int clothingId, String color, String size, String style, int quantity, double price) {
		super();
		this.clothingId = clothingId;
		this.color = color;
		this.size = size;
		this.style = style;
		this.quantity = quantity;
		this.price = price;
	}

	public int getClothingId() {
		return clothingId;
	}

	public void setClothingId(int clothingId) {
		this.clothingId = clothingId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Warehouse [clothingId=" + clothingId + ", color=" + color + ", size=" + size + ", style=" + style + ", quantity="
				+ quantity + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Patagonia other = (Patagonia) obj;
		return clothingId == other.clothingId && Objects.equals(size, other.size) && Objects.equals(style, other.style)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(color, other.color)
				&& price == other.price;
	}

}
