package com.robusto.school.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="schedule")
public class Schedule implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="course_id")
	private Course course;
	
	@JoinColumn(name="instructor_id")
	@OneToOne
	private Employee instructor;
	
	@Column(name="level")
	private String level;
	
	@Column(name="day")
	private int day;
	
	@Column(name="hour")
	private int hour;
	
	@Column(name="minutes")
	private int minutes;

}
