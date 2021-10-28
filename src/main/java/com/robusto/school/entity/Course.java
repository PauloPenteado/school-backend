package com.robusto.school.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_course")
	private int Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="is_available")
	private boolean isAvailable;

	@OneToMany(mappedBy="course", cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Schedule> schedules;
	
	public Course() {
		
	}
	
	public Course(String name, String description, boolean isAvailable) {
		super();
		this.name = name;
		this.description = description;
		this.isAvailable = isAvailable;
	}
	
}
