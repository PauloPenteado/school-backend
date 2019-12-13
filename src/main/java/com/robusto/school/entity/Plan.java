package com.robusto.school.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan")
public class Plan implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="detail_1")
	private String detail1;
	
	@Column(name="detail_2")
	private String detail2;
	
	@Column(name="detail_3")
	private String detail3;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endtDate;
	
	public Plan() {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail1() {
		return detail1;
	}

	public void setDetail1(String detail1) {
		this.detail1 = detail1;
	}

	public String getDetail2() {
		return detail2;
	}

	public void setDetail2(String detail2) {
		this.detail2 = detail2;
	}

	public String getDetail3() {
		return detail3;
	}

	public void setDetail3(String detail3) {
		this.detail3 = detail3;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndtDate() {
		return endtDate;
	}

	public void setEndtDate(Date endtDate) {
		this.endtDate = endtDate;
	}

	public Plan(String name, String detail1, String detail2, String detail3, BigDecimal price, Date startDate,
			Date endtDate) {
		super();
		this.name = name;
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.price = price;
		this.startDate = startDate;
		this.endtDate = endtDate;
	}

	@Override
	public String toString() {
		return "Plan [id=" + Id + ", name=" + name + ", detail1=" + detail1 + ", detail2=" + detail2 + ", detail3="
				+ detail3 + ", price=" + price + ", startDate=" + startDate + ", endtDate=" + endtDate + "]";
	}
	

}
