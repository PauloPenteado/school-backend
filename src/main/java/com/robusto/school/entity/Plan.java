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

import lombok.Data;

@Data
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
}
